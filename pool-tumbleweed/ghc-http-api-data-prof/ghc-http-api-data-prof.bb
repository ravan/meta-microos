SUMMARY = "Haskell http-api-data profiling library"
DESCRIPTION = "This package provides the Haskell http-api-data profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-http-api-data-prof-0.6.3-1.4.aarch64.rpm"
RPM_HASH = "a7a130dad7ed3d3596b38a9c1618e183773fa356053e93c5b16117d78366aa10503c3d2129d7cd3fae1c22df5688dc795f7de4814209f89662e323869eb6b412"

RPROVIDES:${PN} += "ghc-http-api-data-prof \
ghc-prof-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw"

RDEPENDS:${PN} += "ghc-http-api-data-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-prof-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd"

inherit rpm
