SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python313-zict-3.0.0-4.2.noarch.rpm"
RPM_HASH = "722c6454a918b32b0b01f9f5a4de9fa8fb9ca1b5e2237890e3037591666c2d8fc90f4e2833649df4ae38d28866d7381e6762be7a5b125f5eb21a662aec4c4095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zict \
python3.13dist-zict \
python313-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
