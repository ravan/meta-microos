SUMMARY = "Development files for the Open AuTHentication (OATH) HOTP support library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains the header files for the HOTP/TOTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "liboath-devel-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "2f26035a63f998a1de64d12ef2ec3fa6cc722c998f6f1cc2f8655655c55ebc757f0e38358464ef1b7bfb4de837a929caffee47248ada05bd0eea4bb3a281453d"

RPROVIDES:${PN} += "liboath-devel \
pkgconfig-liboath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboath0"

inherit rpm
