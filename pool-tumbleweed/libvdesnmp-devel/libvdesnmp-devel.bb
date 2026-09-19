SUMMARY = "VDE SNMP header files"
DESCRIPTION = "This package contains VDE SNMP header files."
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp-devel-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "15225f343df6d449033ea4c627d5038214df4cac3935e390e3696b3cf0294344e7b32b5887ad04c26d86b6522186c700b529f61fbf2832b802c77e5ff6ada0ac"

RPROVIDES:${PN} += "libvdesnmp-devel \
libvdesnmp0-devel \
pkgconfig-vdesnmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdesnmp0 \
vde2"

inherit rpm
