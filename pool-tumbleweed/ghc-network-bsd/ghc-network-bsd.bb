SUMMARY = "POSIX network database (<netdb.h>) API"
DESCRIPTION = "This package provides Haskell bindings to the the [POSIX network database \
(netdb.h) \
API](http://pubs.opengroup.org/onlinepubs/009696699/basedefs/netdb.h.html). \
 \
=== Relationship to the 'network' package \
 \
The 'network' package version 2.* series provides 'Network.BSD' but it is \
removed starting with 'network' version 3.0. \
 \
This package provides the 'Network.BSD' module split off from the \
<https://hackage.haskell.org/package/network network package>. \
 \
If in addition to the 'network''s modules also 'Network.BSD' is necessary, add \
'network-bsd' to your dependencies like so: \
 \
> library > build-depends: network >= 2.7 && < 3.2 > , network-bsd >= 2.7 && < \
2.9 \
 \
I.e. you can control the version of the 'network' package independently. \
 \
__NOTE__: Starting with 'network-bsd-2.8.1.0' the APIs of 'network' and \
'network-bsd' evolve differently, and consequently the versioning doesn't match \
up anymore! Moreover, also starting with version 'network-bsd-2.8.1.0' this \
package requires 'network >= 3' in order to avoid module name clashes with \
'network < 3''s 'Network.BSD' module. \
 \
However, 'network-bsd-2.7.0.0' and 'network-bsd-2.8.0.0' passes thru the \
'Network.BSD' module from 'network-2.7.*' and 'network-2.8.*' respectively in a \
non-clashing way via Cabal's \
<https://www.haskell.org/cabal/users-guide/developing-packages.html#pkg-field-library-reexported-modules \
reexported-modules> feature while ensuring a well-defined \
<https://pvp.haskell.org/ API versioning> of the observable API of \
'network-bsd'. This is why the example above supporting a wide range of \
'network' versions works by including version 2.7.0.0 in the required version \
range of 'network-bsd'."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-2.8.1.0-9.16.aarch64.rpm"
RPM_HASH = "ee3ac8f82ee7ddaf4390ef5fffa3cd149a1fd4eea80246a4fdb9b4c321450f5bceec33080c3abea4de140d1fa43478b1c8b69a70504f1a3983253a3d582cbcca"

RPROVIDES:${PN} += "ghc-network-bsd \
libHSnetwork-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
