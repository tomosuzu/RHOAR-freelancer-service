# FreelancerService
## Property
* freelancerId
* first name
* last name
* email address
* list of skills (for example: Java, Thorntail, Vert.x, Spring Boot, JPA etc …)

## Technology
* Spring Boot runtime
* PostgreSQL database
* Unit tests

## Explain my design

I created these endpoints.
I chose simple design for entity.
List of skills should be List, but I didn't so.
Because I think this is too much and too predict.
If I create the freelancer add method, I use comma delimiter.

* get "freelancers"
```bash
curl http://freelancer-service-tosuzuki-freelancer.apps.na311.openshift.opentlc.com/freelancers
```

* get "freelancer"
```bash
curl http://freelancer-service-tosuzuki-freelancer.apps.na311.openshift.opentlc.com/freelancers/329299
```


