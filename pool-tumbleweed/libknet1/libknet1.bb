SUMMARY = "Kronosnet core switching implementation"
DESCRIPTION = "The whole kronosnet core is implemented in this library. \
Please refer to the not-yet-existing documentation for further \
information."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-1.33-2.2.aarch64.rpm"
RPM_HASH = "eccd5bc9b544e8d78eeece9948576573ff1851c2036f603ec52ea6fdc4506160cce66b29ad7ff845c78e403387fe222f0b208272d96f1841202d4ac0ea2974b7"

RPROVIDES:${PN} += "libknet.so.1 \
libknet1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
