SUMMARY = "VOLK kernel creation utility"
DESCRIPTION = "This package provides volk_modtool, used for creating new \
VOLK kernels."
LICENSE = "LGPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "volk_modtool-3.3.0-1.5.aarch64.rpm"
RPM_HASH = "92e269c3901d19cf3493c6f7a1b12dfe6080964b979ae5e96671a9889989149ebadd8f7bd2ce9e0532f8b703bf4f07d0c43dd08ee08fb6ae41009333696e1769"

RPROVIDES:${PN} += "volk-modtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
