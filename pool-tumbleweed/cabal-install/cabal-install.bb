SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The 'cabal' command-line program simplifies the process of managing Haskell \
software by automating the fetching, configuration, compilation and \
installation of Haskell libraries and programs."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.1"

RPM_NAME = "cabal-install-3.14.1.1-6.4.aarch64.rpm"
RPM_HASH = "99e90be1f6a98f7822ead388205d785a85f89e48fb95e25ce2b02a1a54b8534c49ecd06c7664422c4787352c4c9eeeb095a015c1e7a5d2b85912c85656307096"

RPROVIDES:${PN} += "cabal-install"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libz.so.1"

inherit rpm
