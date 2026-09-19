SUMMARY = "Console mouse support library"
DESCRIPTION = "This package provides a library that handles mouse requests and \
delivers them to applications. See the description for the 'gpm' \
package for more information."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "libgpm2-1.20.7-23.4.aarch64.rpm"
RPM_HASH = "bdb09757b5db5840b86e0de28a9557dd62ca6c05e4859dbe8f87d208617584a4262ecc0cbe3fa2eeb64d60422ce2d1f922f7bcdbdac16d2c6b446ddd37081009"

RPROVIDES:${PN} += "libgpm.so.2 \
libgpm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
