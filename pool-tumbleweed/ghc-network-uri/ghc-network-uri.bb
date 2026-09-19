SUMMARY = "URI manipulation"
DESCRIPTION = "This package provides facilities for parsing and unparsing URIs, and creating \
and resolving relative URI references, closely following the URI spec, \
<http://www.ietf.org/rfc/rfc3986.txt IETF RFC 3986>. \
 \
== Backward-compatibility \
 \
In 'network-2.6' the 'Network.URI' module was split off from the 'network' \
package into this package. If you're using the 'Network.URI' module you can be \
backward compatible and automatically get it from the right package by using \
the </package/network-uri-flag network-uri-flag pseudo-package> in your \
'.cabal' file's build-depends (along with dependencies for both 'network-uri' \
and 'network'): \
 \
> build-depends: > network-uri-flag == 0.1.* \
 \
Or you can do the same manually by adding this boilerplate to your '.cabal' \
file: \
 \
> flag network-uri > description: Get Network.URI from the network-uri package \
> default: True > > library > -- ... > if flag(network-uri) > build-depends: \
network-uri >= 2.6, network >= 2.6 > else > build-depends: network-uri < 2.6, \
network < 2.6 \
 \
That is, get the module from either 'network < 2.6' or from 'network-uri >= \
2.6'."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-2.6.4.2-3.29.aarch64.rpm"
RPM_HASH = "14370be1562ad02096f7348801e3115406160d85d3d224055ed10fa5a05921e4365bf1fe1885d106928d0b68bfe229b859ed82dbfa2a3b97ce84772a404747cc"

RPROVIDES:${PN} += "ghc-network-uri \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
