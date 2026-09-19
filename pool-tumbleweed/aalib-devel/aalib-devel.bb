SUMMARY = "Development Package for AAlib"
DESCRIPTION = "Files needed for developing software that uses AAlib."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-devel-1.4.0-518.5.aarch64.rpm"
RPM_HASH = "1f0de37587cc74c6a95c3a1083a4cee3fb0eab1b48eea130c1bb048036cd57fff80f2e426f13cea6fa8fff333e9ffda124aa7eff9074c14ec2a5c85d36b51db0"

RPROVIDES:${PN} += "aalib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libaa1"

inherit rpm
