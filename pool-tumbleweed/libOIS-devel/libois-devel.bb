SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libOIS-devel-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "aab403e4391a40f9937a6440df4c5e01861e38e2c3c4090b2eed91f768b393f4c4efd7973c4e73489999bb2e86033ed00ea19ce56a87546079f1daeb070e1f11"

RPROVIDES:${PN} += "libOIS-devel \
pkgconfig-OIS"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOIS1-6-0"

inherit rpm
