SUMMARY = "HTTP client library"
DESCRIPTION = "HTTP client library."
LICENSE = "BSD-3-Clause"

PV = "3.13.4"

RPM_NAME = "ghc-req-3.13.4-3.5.aarch64.rpm"
RPM_HASH = "a9a74af90cb1317a42b03296ce678602f1dbad2244124ef5b3af1a9e0b4b2670a007da17d9b1e61812f981a7308ff2fd4197e869adf0da3228d7ae001e26d948"

RPROVIDES:${PN} += "ghc-req \
libHSreq-3.13.4-GNkdZfYi8gkLPTAscSZ3ct-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSQuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J-ghc9.12.4.so \
libHSRSA-2.4.1-1xID0u6sJ2b79HlbaBWwck-ghc9.12.4.so \
libHSSHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSaeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN-ghc9.12.4.so \
libHSappar-0.1.8-WSZSnBitxp1mS4dOP2hyq-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSasn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI-ghc9.12.4.so \
libHSasn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
libHSauthenticate-oauth-1.7-Hl1x1wWymKfD65sPfJukkt-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbase16-1.0-GqCyVT5DfwtBcN8MC2i0Li-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-1.0-Ca310PwaD9pGmjzA3S4jr6-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSbyteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHScborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ-ghc9.12.4.so \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so \
libHScharacter-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHScookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft-ghc9.12.4.so \
libHScrypto-api-0.13.3-BvysNl9crxvRkhKzviyjB-ghc9.12.4.so \
libHScrypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t-ghc9.12.4.so \
libHScryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS-ghc9.12.4.so \
libHScrypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB-ghc9.12.4.so \
libHScrypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1-ghc9.12.4.so \
libHScrypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ-ghc9.12.4.so \
libHScrypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB-ghc9.12.4.so \
libHScrypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y-ghc9.12.4.so \
libHScrypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij-ghc9.12.4.so \
libHScrypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9-ghc9.12.4.so \
libHScrypton-x509-1.9.1-haGktaKI8uFy9MudMqGII-ghc9.12.4.so \
libHScrypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh-ghc9.12.4.so \
libHScrypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp-ghc9.12.4.so \
libHScrypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdata-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSdlist-1.0-24EafZnoZk8EE7HqnP59eC-ghc9.12.4.so \
libHSech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND-ghc9.12.4.so \
libHSentropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShalf-0.3.3-7uW8H7RguCn8iNkagLajaD-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o-ghc9.12.4.so \
libHShpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n-ghc9.12.4.so \
libHShttp-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw-ghc9.12.4.so \
libHShttp-client-0.7.19-4BIOUl8FXXcE32miDzHR9M-ghc9.12.4.so \
libHShttp-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV-ghc9.12.4.so \
libHShttp-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinteger-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSiproute-1.7.15-E8DjYDi46DFHUJbuCQco8p-ghc9.12.4.so \
libHSmegaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6-ghc9.12.4.so \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so \
libHSmime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp-ghc9.12.4.so \
libHSmlkem-0.2.1.0-I3LOwjV1LZnU6D8hY2Ok5-ghc9.12.4.so \
libHSmodern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6-ghc9.12.4.so \
libHSmonad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSprofunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG-ghc9.12.4.so \
libHSram-0.22.0-4Io46KcWliV5ncwh4lemlr-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSreflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF-ghc9.12.4.so \
libHSretry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSsemialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSserialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstreaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStime-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS-ghc9.12.4.so \
libHStime-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l-ghc9.12.4.so \
libHStls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSwitherable-0.5-9N1HkgvlVrcAVLkWTGxi2z-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
