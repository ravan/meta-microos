SUMMARY = "Haskell http-api-data library development files"
DESCRIPTION = "This package provides the Haskell http-api-data library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-http-api-data-devel-0.6.3-1.4.aarch64.rpm"
RPM_HASH = "a4a019fca5ad6a010dbb497b6d93e6bc8e7eaf51b09cd916e713f5de219c99b26302496264eded89adc6c21d9c143ccb8ae6e302222d7787621c07df0c5e179a"

RPROVIDES:${PN} += "ghc-devel-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-http-api-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-devel-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-http-api-data"

inherit rpm
