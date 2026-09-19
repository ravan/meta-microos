SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.5.0+git10516"

RPM_NAME = "libgo22-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "a055151f234e72fddf1613a06f9347acc5ca4c193428728b24b670cdae86e60156e7a25b562feed3a47e04a0330f39d69bd65f840389d6e749104805f9b69007"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
