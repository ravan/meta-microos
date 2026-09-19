SUMMARY = "More sophisticated version manipulation (than packaging)"
DESCRIPTION = "More sophisticated version manipulation (than packaging)"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-jaraco.versioning-1.1.0-4.2.noarch.rpm"
RPM_HASH = "c16dc68f33b1e44ff34fc5d1dfc7a562d430c862ca551b19b987ed6b23f029f62ad8a06226e0cd716462a9c0739526ae9a42854c0abdf0eb28ef97c19aae74f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.versioning \
python314-jaraco.versioning \
python3dist-jaraco.versioning"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
