SUMMARY = "Devel package for libdrop_ambient0"
DESCRIPTION = "This package contains the files needed for developing \
applications that need to use the libdrop_ambient library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "libdrop_ambient-devel-0.8.5-1.10.aarch64.rpm"
RPM_HASH = "9ad90ecd334afe2c36c166b9a46d83b6c19441be1e958445ce43bdb5e8a962d91ca69af7aaccdef86e733b48e442aa3d8d1041d4c0a0977bd89b091baf75a249"

RPROVIDES:${PN} += "libdrop-ambient-devel"

RDEPENDS:${PN} += "libdrop-ambient0"

inherit rpm
