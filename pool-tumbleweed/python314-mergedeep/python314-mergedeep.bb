SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python314-mergedeep-1.3.4-4.5.noarch.rpm"
RPM_HASH = "0df90ae562cf579b34c9ea270a4a2c4787d13a696f3967298db15a0b4d2eb6c573b3ab253e68c4656802fd23fcdaa15d039a6eba16cecbfc3050b599adbdd785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mergedeep \
python314-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
