SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-deepmerge-2.1.0-1.1.noarch.rpm"
RPM_HASH = "3695ac97e0083f3b5807911c13179769b094c887db84ea150e323ec906615d6c4a1f07e85f93da1fe661bed760e7496c4104f91502b4eb1645de421af82cd861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepmerge \
python3.13dist-deepmerge \
python313-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
