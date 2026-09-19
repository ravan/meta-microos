SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.7"

RPM_NAME = "python313-tcolorpy-0.1.7-1.7.noarch.rpm"
RPM_HASH = "b774b27f23761f44f7d6d3d385cffd2d5b2a1596d5df7e1e5494026b7590c4dd2ed591cd76f4d26ab88ddfec92a76dc90ffc3801b8a35d5c864e779af3be4da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tcolorpy \
python3.13dist-tcolorpy \
python313-tcolorpy \
python3dist-tcolorpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
