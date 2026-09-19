SUMMARY = "List mount points"
DESCRIPTION = "Lists currently mounted filesystems. \
 \
Works on: Linux, BSD, Mac OS X, Android."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-1.0.2-4.24.aarch64.rpm"
RPM_HASH = "9610ebd4de6f30ab0d540b146c61a8b4340950fb277b65cddd24322874a716c96f911d5d651d6efb4afa19e167adbb1d74cb91b006c8a9db0b3bb32273693254"

RPROVIDES:${PN} += "ghc-mountpoints \
libHSmountpoints-1.0.2-35WJHyDVhGJG15R347ykZV-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
