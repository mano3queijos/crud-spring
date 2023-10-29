package com.emanuel.springcloudpsql.controller;

import com.emanuel.springcloudpsql.model.Contact;
import com.emanuel.springcloudpsql.repository.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

    private ContactRepository repository;

    ContactController(ContactRepository contactRepository){
        this.repository = contactRepository;
    }

    //CRUD methods here

    @GetMapping
    public List findAll(){
        return repository.findAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Contact> findById(@PathVariable long id){
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Contact create(@RequestBody Contact contact){
        return repository.save(contact);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Contact> update(@PathVariable("id") long id, @RequestBody Contact contact){
    return repository.findById(id).map(record ->{
        record.setName(contact.getName());
        record.setEmail(contact.getEmail());
        record.setPhone(contact.getPhone());
        Contact updated = repository.save(record);
        return  ResponseEntity.ok().body(updated);

    }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/{id})")
    public ResponseEntity<?> delete(@PathVariable("id") long id){

        return repository.findById(id).map(record ->{
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());  }

}
