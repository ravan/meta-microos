SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-devel-1.3.0-31.19.aarch64.rpm"
RPM_HASH = "96d017d4145f9ecf44e008e1a92a300002295d90ce4ec378400346964391724848cc152412eccce61cb54bdc896693bab57c6ea1d0ea7087a5eac737f3c8cb9c"

RPROVIDES:${PN} += "lib3ds-devel \
pkgconfig-lib3ds"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
lib3ds-1-3 \
lib3ds-1.so.3 \
libc.so.6"

inherit rpm
