SUMMARY = "Allows you to access the internet through a HTTP proxy"
DESCRIPTION = "TransConnect is a program to allow you almost complete access to the \
internet through a HTTP proxy like squid."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "transconnect-1.2-421.5.aarch64.rpm"
RPM_HASH = "1ab38da11a469a2e8ebfcfee6b1c9fc358c47b63eace4fc44bd36443ae7ff2b1620be373a4c1b765706593dda89a7f28827bd971493c7ec379540eb2ea721eba"

RPROVIDES:${PN} += "transconnect"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
