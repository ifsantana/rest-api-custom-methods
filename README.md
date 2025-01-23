# Rest Api Custom Methods Sample

Custom methods

Resource-oriented design ([AIP-121](https://google.aip.dev/121)) uses custom methods to provide a means to express arbitrary actions that are difficult to model using only the standard methods. 
Custom methods are important because they provide a means for an API's vocabulary to adhere to user intent.

Guidance
Custom methods should only be used for functionality that can not be easily expressed via standard methods; prefer standard methods if possible, due to their consistent semantics. (Of course, this only applies if the functionality in question actually conforms to the normal semantics; it is not a good idea to contort things to endeavor to make the standard methods "sort of work".)

## Endpoitns List:

### Enable Users

```http://localhost:8080/v1/users/1:enable```

### Disable Users

```http://localhost:8080/v1/users/1:disable```

