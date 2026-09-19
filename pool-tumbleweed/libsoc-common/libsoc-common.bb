SUMMARY = "Common files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines. \
 \
This package contains common config files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-common-0.8.2-4.3.noarch.rpm"
RPM_HASH = "df8ed52a482f6b0e09f4a16b9ad61d38cf3223ed7f55a8521469ec6e7ae546e56871b8013b0b7ba6613b886cdd2f7ce80037747b8d8b7f9e407a9b9b85f0b20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsoc-common"

RDEPENDS:${PN} += ""

inherit rpm
