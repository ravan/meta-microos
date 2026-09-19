SUMMARY = "Haskell aeson library development files"
DESCRIPTION = "This package provides the Haskell aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.5.0"

RPM_NAME = "ghc-aeson-devel-2.2.5.0-1.3.aarch64.rpm"
RPM_HASH = "c2db6af93e3e2c31655163fa7891c18a432c5dd466607c61131a05a32128cb17997d277e18cdab525a5d577252b51fe824b4d2327e707aedf3f157fefa570069"

RPROVIDES:${PN} += "ghc-aeson-devel \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson \
ghc-compiler \
ghc-devel-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-dlist-1.0-24EafZnoZk8EE7HqnP59eC \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-devel-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2 \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-semialign-1.3.1.1-2gupAkHqo8uDH6Y43n5yi0 \
ghc-devel-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-devel-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-time-1.14-a7dc \
ghc-devel-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-witherable-0.5-9N1HkgvlVrcAVLkWTGxi2z"

inherit rpm
