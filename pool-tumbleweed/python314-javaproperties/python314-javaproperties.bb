SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-javaproperties-0.8.2-1.8.noarch.rpm"
RPM_HASH = "522b434d8c3ef518815a7951250f9e7adcc0afdea97581a359d205a5bdec52476997214638463c34e20a256fbe50bcaa52cbe53452e3ba130b9d0571a530f2ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-javaproperties \
python314-javaproperties \
python3dist-javaproperties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
