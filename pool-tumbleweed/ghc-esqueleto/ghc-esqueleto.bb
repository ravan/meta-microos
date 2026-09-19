SUMMARY = "Type-safe EDSL for SQL queries on persistent backends"
DESCRIPTION = "'esqueleto' is a bare bones, type-safe EDSL for SQL queries that works with \
unmodified 'persistent' SQL backends. Its language closely resembles SQL, so \
you don't have to learn new concepts, just new syntax, and it's fairly easy to \
predict the generated SQL and optimize it for your backend. Most kinds of \
errors committed when writing SQL are caught as compile-time errors---although \
it is possible to write type-checked 'esqueleto' queries that fail at runtime. \
 \
'persistent' is a library for type-safe data serialization. It has many kinds \
of backends, such as SQL backends ('persistent-mysql', 'persistent-postgresql', \
'persistent-sqlite') and NoSQL backends ('persistent-mongoDB'). While \
'persistent' is a nice library for storing and retrieving records, including \
with filters, it does not try to support some of the features that are specific \
to SQL backends. In particular, 'esqueleto' is the recommended library for \
type-safe 'JOIN's on 'persistent' SQL backends. (The alternative is using raw \
SQL, but that's error prone and does not offer any composability.) \
 \
Currently, 'SELECT's, 'UPDATE's, 'INSERT's and 'DELETE's are supported. \
Not all SQL features are available, but most of them can be easily added \
(especially functions), so please open an issue or send a pull request if you \
need anything that is not covered by 'esqueleto' on \
<https://github.com/bitemyapp/esqueleto>. \
 \
The name of this library means 'skeleton' in Portuguese and contains all three \
SQL letters in the correct order =). It was inspired by Scala's Squeryl but \
created from scratch."
LICENSE = "BSD-3-Clause"

PV = "3.6.0.0"

RPM_NAME = "ghc-esqueleto-3.6.0.0-1.17.aarch64.rpm"
RPM_HASH = "c270631d94dd220421757a8d7b714a08f1f02b8cf65fb0d573304e0512b8436de1fb5cf1dd76b9851d0e5971a7b6178be8e446734fc99208a59a9dc9dc0273bb"

RPROVIDES:${PN} += "ghc-esqueleto \
libHSesqueleto-3.6.0.0-4dX9N9hTHfJ2dn3RluDp8O-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSQuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSaeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
libHSattoparsec-0.14.4-DCHy075kASN7LSOqkXsGoX-attoparsec-internal-ghc9.12.4.so \
libHSattoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7-ghc9.12.4.so \
libHSattoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj-ghc9.12.4.so \
libHSauto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSblaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o-ghc9.12.4.so \
libHSblaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHScharacter-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHSconduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt-ghc9.12.4.so \
libHSconduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHScookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdata-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSdlist-1.0-24EafZnoZk8EE7HqnP59eC-ghc9.12.4.so \
libHSeasy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShttp-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw-ghc9.12.4.so \
libHShttp-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinteger-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSlift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO-ghc9.12.4.so \
libHSlifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV-ghc9.12.4.so \
libHSmegaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6-ghc9.12.4.so \
libHSmonad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt-ghc9.12.4.so \
libHSmonad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG-ghc9.12.4.so \
libHSmonad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b-ghc9.12.4.so \
libHSmono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so \
libHSpath-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH-ghc9.12.4.so \
libHSpersistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSreplace-megaparsec-1.5.0.1-3raT401RHe83TCy1jsbTxZ-ghc9.12.4.so \
libHSresource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW-ghc9.12.4.so \
libHSresourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE-ghc9.12.4.so \
libHSsafe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSsemialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSsilently-1.2.5.4-54yCGOZ1hqDAcZZPz9a2Bu-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK-ghc9.12.4.so \
libHSstreaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSth-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStime-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHStyped-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn-ghc9.12.4.so \
libHSunix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q-ghc9.12.4.so \
libHSunliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so \
libHSvault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSwitherable-0.5-9N1HkgvlVrcAVLkWTGxi2z-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
