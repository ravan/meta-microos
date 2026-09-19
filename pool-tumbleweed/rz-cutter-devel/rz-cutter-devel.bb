SUMMARY = "Development files for the cutter-re package"
DESCRIPTION = "Development files for the cutter-re package. See cutter-re package for more \
information."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "rz-cutter-devel-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "4ca51811fb7fbfe51db3294fbffa64bde7af2bd2953c513d8bd440feb6c17787eb523606031aeecee1da4764bb9ef4fd2213cea07ef013b7662cbca9fb2bb226"

RPROVIDES:${PN} += "cmake-Cutter \
rz-cutter-devel"

RDEPENDS:${PN} += "rz-cutter"

inherit rpm
