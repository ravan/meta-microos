SUMMARY = "Simple docserv webserver"
DESCRIPTION = "Simple docserv webserver with integrated auxserver for development and test purposes. Not for production."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "docserv-minisrv-20260707.78c4c29-1.2.aarch64.rpm"
RPM_HASH = "232b4c1c52e3b90275da7ff099b67222d3822285fd6446290e38522da17ebd9d60fe16bf1c0ea4e612c626c769e4507569ab68d3d0b13389d9bb031b47af1a2c"

RPROVIDES:${PN} += "docserv-minisrv \
group-docserv-srv \
user-docserv-srv"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
