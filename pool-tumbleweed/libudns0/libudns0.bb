SUMMARY = "DNS resolver library"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6"

RPM_NAME = "libudns0-0.6-1.9.aarch64.rpm"
RPM_HASH = "780b90804b92ef9d861e30464acec43bc80542828db08a09df04fb120426c6f50350a26af2e8356f9cd4347dcb80f7e9d33bcc052993c753c0eb2cdd146fde19"

RPROVIDES:${PN} += "libudns.so.0 \
libudns0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
