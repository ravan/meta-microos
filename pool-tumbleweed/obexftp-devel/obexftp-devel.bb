SUMMARY = "Development package for obexftp"
DESCRIPTION = "Files needed for software development using obexftp."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-devel-0.24.2-3.10.aarch64.rpm"
RPM_HASH = "430420be5f2b6e2eeec65a64e44643c8314003498539503ee5b6262d650e5e85e9f6836db967f7c5587d011ec684c0524fb90298d9ffcbf6df452f0b78ebe316"

RPROVIDES:${PN} += "obexftp-devel \
pkgconfig-obexftp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
obexftp \
openobex-devel \
pkgconfig-bluez \
pkgconfig-openobex"

inherit rpm
