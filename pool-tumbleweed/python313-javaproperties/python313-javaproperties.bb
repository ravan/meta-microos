SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python313-javaproperties-0.8.2-1.8.noarch.rpm"
RPM_HASH = "c05fc0934f3eb8220cd434a0c65e5f3a69474e444c8e68fa29d7c8cd7daf14a622761021a1075020aac740037c4fcd79f8a926e07fd4f5eb761ee9144bc502d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javaproperties \
python3.13dist-javaproperties \
python313-javaproperties \
python3dist-javaproperties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
