SUMMARY = "A library providing the core functionality of hledger"
DESCRIPTION = "This library contains hledger's core functionality. It is used by most hledger* \
packages so that they support the same command line options, file formats, \
reports, etc. \
 \
hledger is a robust, cross-platform set of tools for tracking money, time, or \
any other commodity, using double-entry accounting and a simple, editable file \
format, with command-line, terminal and web interfaces. It is a Haskell rewrite \
of Ledger, and one of the leading implementations of Plain Text Accounting. \
 \
See also: \
 \
- https://hledger.org - hledger's home page \
 \
- https://hledger.org/dev.html - starting point for hledger's developer docs \
 \
- https://hackage.haskell.org/package/hledger-lib/docs/Hledger.html - starting \
point for hledger's haddock docs."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-lib-1.52.1-1.4.aarch64.rpm"
RPM_HASH = "8a500774889d205cafdc0eb20be22ecb8bd948d10e6ee19115d69e0e91d3644be07599d75aa2ebd889720b8daa0c87c08f0ebc04f0525982ff898ad565136dcc"

RPROVIDES:${PN} += "ghc-hledger-lib \
libHShledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSDecimal-0.5.2-1UdB985IcTF52sAwbBdCjx-ghc9.12.4.so \
libHSGlob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r-ghc9.12.4.so \
libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so \
libHSOnly-0.1-JTlBo1y3Iulx07n0z4y7-ghc9.12.4.so \
libHSQuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J-ghc9.12.4.so \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSaeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN-ghc9.12.4.so \
libHSaeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7-ghc9.12.4.so \
libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSattoparsec-0.14.4-DCHy075kASN7LSOqkXsGoX-attoparsec-internal-ghc9.12.4.so \
libHSattoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSblaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o-ghc9.12.4.so \
libHSblaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScall-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3-ghc9.12.4.so \
libHScase-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC-ghc9.12.4.so \
libHScassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR-ghc9.12.4.so \
libHScassava-megaparsec-2.1.1-92PMhFSA6UZBxfXRek9rSe-ghc9.12.4.so \
libHScharacter-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ-ghc9.12.4.so \
libHSclock-0.8.4-Jabd1gSnpD77RKirxFCoTK-ghc9.12.4.so \
libHScmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHScsv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSdlist-1.0-24EafZnoZk8EE7HqnP59eC-ghc9.12.4.so \
libHSdoclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii-ghc9.12.4.so \
libHSemojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s-ghc9.12.4.so \
libHSencoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSextra-1.8.1-J47FlDu75Mb8OlFkJuPlkW-ghc9.12.4.so \
libHSfile-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHShashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT-ghc9.12.4.so \
libHShtml-1.0.1.2-47pIZc0gzI25DOiguxUrYX-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSindexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH-ghc9.12.4.so \
libHSinteger-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO-ghc9.12.4.so \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSlucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1-ghc9.12.4.so \
libHSmegaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSmicrolens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN-ghc9.12.4.so \
libHSmmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSoptparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSpretty-simple-4.1.4.0-mOFDy31oJk3EKW6ny09ID-ghc9.12.4.so \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so \
libHSprettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHSregex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj-ghc9.12.4.so \
libHSregex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS-ghc9.12.4.so \
libHSregex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSsemialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0-ghc9.12.4.so \
libHSsemigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d-ghc9.12.4.so \
libHStasty-hunit-0.10.2-7q5ZQxy9Ub5ZvPfhG0K4P-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSterminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStime-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS-ghc9.12.4.so \
libHStimeit-2.0-3tAgGDzIoCu1cNsnFuFQeC-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSuglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libHSwitherable-0.5-9N1HkgvlVrcAVLkWTGxi2z-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
