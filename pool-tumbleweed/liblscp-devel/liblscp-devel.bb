SUMMARY = "LinuxSampler Control Protocol Library"
DESCRIPTION = "liblscp is an implementation of the LinuxSampler control protocol, \
proposed as a C language API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "liblscp-devel-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "20ff2e2c444dcef7024fb31bc6f18ad3f77373b38e7e98c6ba5d613440ff4a01854c0aed26efb9f084439580a8372049226fcd66971a30643ffeace77a5c8795"

RPROVIDES:${PN} += "liblscp-devel \
pkgconfig-lscp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblscp6"

inherit rpm
