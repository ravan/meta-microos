SUMMARY = "Hatchling plugin to read project dependencies from requirements.txt"
DESCRIPTION = "Hatchling plugin to read project dependencies from requirements.txt"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-hatch-requirements-txt-0.4.1-4.5.noarch.rpm"
RPM_HASH = "faf817c68884781ba42f06167f97b68fba204ec4c4f21c050280e57b115d829562d711a26686167498f150db41ff7f1d23c3a3c824a25a33890d8041bdf24cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-requirements-txt \
python3.13dist-hatch-requirements-txt \
python313-hatch-requirements-txt \
python3dist-hatch-requirements-txt"

RDEPENDS:${PN} += "python-abi \
python313-hatchling \
python313-packaging"

inherit rpm
