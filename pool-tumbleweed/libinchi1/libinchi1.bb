SUMMARY = "The IUPAC International Chemical Identifier library"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the InChi shared library."
LICENSE = "MIT"

PV = "1.07.5"

RPM_NAME = "libinchi1-1.07.5-1.4.aarch64.rpm"
RPM_HASH = "aa697df3dfdca800f02e95f040f6214154c0581d7395738fb995ce72a319e20572fb93fd447f677f6c4ff0eb6007207e7879a56e38581b0a89b17b51ef565ee0"

RPROVIDES:${PN} += "libinchi.so.1 \
libinchi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
