SUMMARY = "DWARF processing library development files"
DESCRIPTION = "This package contains the development files for libdwarves, a library \
for processing DWARF, a debugging data format for ELF files."
LICENSE = "GPL-2.0-only"

PV = "1.31"

RPM_NAME = "dwarves-devel-1.31-1.5.aarch64.rpm"
RPM_HASH = "491fb90657946d56ceedec44c11262577aafb25876c31e5ac2be534b02bef575b799d594f2ab39dc903e5bbb9508cb6c6b7e4ab13f227da00434edd5828d3db4"

RPROVIDES:${PN} += "dwarves-devel \
libdwarves-devel"

RDEPENDS:${PN} += "libdwarves1"

inherit rpm
