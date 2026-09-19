SUMMARY = "Low-level networking interface"
DESCRIPTION = "This package provides a low-level networking interface. \
 \
=== High-Level Packages Other packages provide higher level interfaces: \
 \
* connection * hookup * network-simple \
 \
=== Extended Packages 'network' seeks to provide a cross-platform core for \
networking. As such some APIs live in extended libraries. Packages in the \
'network' ecosystem are often prefixed with 'network-'. \
 \
==== 'network-bsd' In 'network-3.0.0.0' the 'Network.BSD' module was split off \
into its own package, 'network-bsd-3.0.0.0'. \
 \
==== 'network-uri' In 'network-2.6' the 'Network.URI' module was split off into \
its own package, 'network-uri-2.6'. If you're using the 'Network.URI' module \
you can automatically get it from the right package by adding this to your \
'.cabal' file: \
 \
> library > build-depends: network-uri-flag."
LICENSE = "BSD-3-Clause"

PV = "3.2.8.0"

RPM_NAME = "ghc-network-3.2.8.0-1.9.aarch64.rpm"
RPM_HASH = "8217992eec60a0c2d3639c7f549fb40b4ce2b4483ad00927e74ef7495a64e6b216c99900023dcfc78365d86e1138c0c422c24ce554112b2195c61b17be1eb152"

RPROVIDES:${PN} += "ghc-network \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so"

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
