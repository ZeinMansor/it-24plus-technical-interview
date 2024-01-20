## GeoLocator Backend Service:

We are following MVC architecture with service & repository layers

### Code Structure
**Controller Package**
 - Handles incoming `HTTP requests`, validate submitted data structure
 

**Service Package**
- Holds the business logic of the applicatoin `GetAddressinfoService` 
- Handles third party API requests `GeoLocationApi`
- Check data availability in cache `CachedInforService`
- Handles email service `MailService`

**Repository**
- Data access layer. 

**Model**
- Data representation layer

**DTO**
- Data transfer objects, POJO classes to separate transferred data from our model layer, implments `Serializable` interface for `JSON` parsing

**Shared**
- Global package for utility classes



### Application Issues
- Could not find free SMTP server that works from my location

### Enhancements 
1. Build the Mail Service
