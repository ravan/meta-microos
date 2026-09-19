SUMMARY = "Haskell hlint library"
DESCRIPTION = "This package provides the Haskell hlint shared library."
LICENSE = "BSD-3-Clause"

PV = "3.10"

RPM_NAME = "ghc-hlint-3.10-1.17.aarch64.rpm"
RPM_HASH = "558ecb3625445c47310181a703b64c73af24df8e63475db4bf6b8dd18bf38848800050644925791b205fa04fd647ecca13caa504d8ed5a1388735ac405c7cd04"

RPROVIDES:${PN} += "ghc-hlint \
libHShlint-3.10-1bXi3hD8i4N69pE8phCza6-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSQuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSaeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN-ghc9.12.4.so \
libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSattoparsec-0.14.4-DCHy075kASN7LSOqkXsGoX-attoparsec-internal-ghc9.12.4.so \
libHSattoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScharacter-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ-ghc9.12.4.so \
libHSclock-0.8.4-Jabd1gSnpD77RKirxFCoTK-ghc9.12.4.so \
libHScmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHSconduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHScpphs-1.20.10-CewphWkQP3qH9WB1ikGBAW-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSderiving-aeson-0.2.10-A2Hr72Vk9XP91w802TwQUN-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSdlist-1.0-24EafZnoZk8EE7HqnP59eC-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSextra-1.8.1-J47FlDu75Mb8OlFkJuPlkW-ghc9.12.4.so \
libHSfile-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSfilepattern-0.1.3-KZHQp0sesewHup360RGBuM-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L-ghc9.12.4.so \
libHSghc-lib-parser-ex-9.12.0.0-AQFnDqoQhTuCgXxh1T0SWZ-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShpc-0.7.0.2-1e89-ghc9.12.4.so \
libHShscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinteger-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSlibyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s-ghc9.12.4.so \
libHSmono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpolyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSrefact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt-ghc9.12.4.so \
libHSresourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSsemialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
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
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSuniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSwitherable-0.5-9N1HkgvlVrcAVLkWTGxi2z-ghc9.12.4.so \
libHSyaml-0.11.11.2-DNw228htw8L33w1OC1EWSt-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libyaml-0.so.2"

inherit rpm
