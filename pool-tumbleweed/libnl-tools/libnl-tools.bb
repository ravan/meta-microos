SUMMARY = "Command line utilities to directly work with Netlink"
DESCRIPTION = "Various test program with which the functionality of libnl is \
demonstrated."
LICENSE = "GPL-2.0-only"

PV = "3.12.0"

RPM_NAME = "libnl-tools-3.12.0-1.5.aarch64.rpm"
RPM_HASH = "9dec5318958170aaa015968b59571d9847786b02267fcbb84b34750f65ac2f9a926128169864c763c7130f79ea6768df55cf6a9e6ec02bdbe38663088586b7c2"

RPROVIDES:${PN} += "libnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-idiag-3.so.200 \
libnl-nf-3.so.200 \
libnl-route-3.so.200"

inherit rpm
