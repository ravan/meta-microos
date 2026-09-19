SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-deepmerge-2.1.0-1.1.noarch.rpm"
RPM_HASH = "458b67598e5e2335e4c4e151a26e34d5ab0b97d634d6319f3e6b2c65dc82c4322ab6ad4daaaf3b800bf041188eb5573355e0131620904c04782db375fb196bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-deepmerge \
python314-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
