SUMMARY = "Development part of library for USB Firewall including flex/bison parser"
DESCRIPTION = "Development part of library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser-devel-1.0.5-1.14.aarch64.rpm"
RPM_HASH = "663c291583ab3c743b8b2dfbb69dd451a15769f4533c464d8f4a30336416ae9867b372a757503decd6063a692df96966cf37da74bf435cbf83b070617314c91d"

RPROVIDES:${PN} += "libusbauth-configparser-devel \
pkgconfig-libusbauth-configparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbauth-configparser1"

inherit rpm
