SUMMARY = "Command line tool for SSO with Entra via Himmelblau"
DESCRIPTION = "Applications can link with this library to get Entra Conditional Access tokens \
for authentication and Single-Sign-On from the Himmelblau stack. \
 \
This package contains command line tools that use the shared library."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "sso-mib-tool-0.10.1-1.2.aarch64.rpm"
RPM_HASH = "be55a1dec95415b580f9e3991eda288b1e3c29b314a5ec2c3552b606c956318ef3b62cf785b181bdb131a53d938704d87b3db95960f56f2d620ceb8dc927a4e3"

RPROVIDES:${PN} += "sso-mib-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libjwt.so.2 \
libsso-mib.so.0 \
libuuid.so.1"

inherit rpm
