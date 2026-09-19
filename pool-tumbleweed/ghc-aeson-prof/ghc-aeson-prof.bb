SUMMARY = "Haskell aeson profiling library"
DESCRIPTION = "This package provides the Haskell aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.5.0"

RPM_NAME = "ghc-aeson-prof-2.2.5.0-1.3.aarch64.rpm"
RPM_HASH = "461821d1bcb0ab5fc2066eb5ddf3a4d25fa8fde4ec069e42bb74c789a5d8d1ca8c6d72b417b5f35ea5310a8893eb84724f8ff09fdb83c403a95fe3924f3ce572"

RPROVIDES:${PN} += "ghc-aeson-prof \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN"

RDEPENDS:${PN} += "ghc-aeson-devel \
ghc-prof-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo \
ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-dlist-1.0-24EafZnoZk8EE7HqnP59eC \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-prof-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2 \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-semialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0 \
ghc-prof-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-prof-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-time-1.14-a7dc \
ghc-prof-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-witherable-0.5-9N1HkgvlVrcAVLkWTGxi2z"

inherit rpm
