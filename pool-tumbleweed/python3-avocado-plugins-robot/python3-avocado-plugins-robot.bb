SUMMARY = "Avocado robot plugin"
DESCRIPTION = "This optional plugin enables Avocado to work with tests originally written \
using the Robot Framework API."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-robot-113.0-1.2.noarch.rpm"
RPM_HASH = "6eb31e49dd26fcec0286407d15916b29444fcb4270151304f793eaa950ad24723f272b1fd2b56111ce598dfea4618f16c7fe17783528d101a5a61661f35deccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-robot \
python3.13dist-avocado-framework-plugin-robot \
python3dist-avocado-framework-plugin-robot"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-robotframework"

inherit rpm
