SUMMARY = "Haskell torrent profiling library"
DESCRIPTION = "This package provides the Haskell torrent profiling library."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-prof-10000.1.3-1.32.aarch64.rpm"
RPM_HASH = "dc55678273ef75fcd96a8ed659205d46a7a617da044d6cba8a5719dccb1738bcd12615944c2daa15e8decc8efdeff3fc26f869ac83e0db4adda8ec63a3ace9ad"

RPROVIDES:${PN} += "ghc-prof-torrent-10000.1.3-FDBlXWeq8Eo78d8gddJr1A \
ghc-torrent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bencode-0.6.1.1-KWSVkFpNEL1HhwrIArSQND \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-torrent-devel"

inherit rpm
