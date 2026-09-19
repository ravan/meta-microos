SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-bdbhpt-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "712453ac5831a6def444012c7348a5ccd19118e15997b5946d78058a1f7f61a691fd00d5a863e64ab8c4a064cece969a5610d14ed0dd26abba7b38e5b3a57e58"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
