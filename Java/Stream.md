# Streams

### Before Streams
- - -
- 배열 또는 컬렉션 인스턴스를 다루는 방법은 loop를 돌면서 요소 하나씩 꺼내서 다룸
- 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이게 됨
- 메소드를 나눌 경우 루프를 여러 번 도는 경우 발생


### Stream
- - -
- Java 8에서 추가
- '데이터의 흐름'
- 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있음
- 람다를 활용해서 코드의 양을 줄이고 간결하게 표현 가능 --> 함수형으로 처리
- 간단하게 병렬처리(Multi-threading)
- 과정 : 생성하기 -> 가공하기 -> 결과 만들기


## 1. 생성하기 : 스트림 인스턴스 생성
- 배열 스트림
```
String[] arr = new String[]{"a","b","c"};
Stream<String> stream = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); 
```

- 컬렉션 스트림 (Collection, List, Set)
```
List<String> list = Arrays.asList("a","b","c");
Stream<String> stream = list.stream();
Stream<String> parallelStream = list.parallelStream(); //병렬 처리 스트림
```

- Stream.builder() : 직접적으로 원하는 값 입력 
```
Stream<String> builderStream = Stream.<String>builder()
    .add("a").add("b").add("c")
    .build(); // [a, b, c]
```

- Stream.generate()
``` 
Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); // [gen, gen, gen, gen, gen]
```

- 

















```



