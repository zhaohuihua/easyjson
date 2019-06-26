# easyjson
Provides a unified JSON access API, you can adapter any JSON library to Gson, Jackson, FastJson with easyjson.

## Modules
1. **easyjson-gson**: use it, you can adapter any json library to Google gson.
2. **easyjson-jackson**: use it, you can adapter any json library to jackson. If you working in a spring application, this is recommend.
3. **easyjson-fastjson**: use it, you can adapter any json library to Alibaba fastjson.
4. **easyjson-core**: the core module. use it you can adapter any json library to easyjson,the other wary round, you can adapter any a json library to any json library.
5. **fastjson-to-easyjson**: adapter fastjosn to easyjson (gson, jackson)
6. **progsbase-to-easyjson**: adapter progsbase to easyjson (gson, jackson)
7. **easyjson-examples**: test cases

## Usage
### Key Features
1. Supports **gson**, **fastjson**, **jackson**, **Progsbase**
2. Supports tree model, stream model
3. Control whether serialize null
4. Convert ON|OFF, 1|0 to Boolean
5. Serialize or deserialize a Enum based on custom field
6. Serialize or deserialize a Date using specified pattern | date format
7. Supports custom exclusion rule, for examples: @Ignore, transient, specified modifier ...
8. Get the JSONBuilder with zero configuration
9. Switch the underlying implement without any code change 
10. Supports JDK 1.6+

### Quick Start
#### installation

if you want use gson:
```xml
<dependency>
    <groupId>com.github.fangjinuo.easyjson</groupId>
    <artifactId>easyjson-gson</artifactId>
    <version>${easyjson.version}</version>
</dependency>
```
if you want use jackson:
```xml
<dependency>
    <groupId>com.github.fangjinuo.easyjson</groupId>
    <artifactId>easyjson-jackson</artifactId>
    <version>${easyjson.version}</version>
</dependency>
```
if you want use fastjson:
```xml
<dependency>
    <groupId>com.github.fangjinuo.easyjson</groupId>
    <artifactId>easyjson-fastjson</artifactId>
    <version>${easyjson.version}</version>
</dependency>
```
if you want adapter fastjson to easyjson:
```xml
<dependency>
    <groupId>com.github.fangjinuo.easyjson</groupId>
    <artifactId>fastjson-to-easyjson</artifactId>
    <version>${easyjson.version}</version>
</dependency>
```
if you want adapter progsbase to easyjson:
```xml
<dependency>
    <groupId>com.github.fangjinuo.easyjson</groupId>
    <artifactId>progsbase-to-easyjson</artifactId>
    <version>${easyjson.version}</version>
</dependency>
```

#### How to:
   ***@see*** easyjson-examples testcases