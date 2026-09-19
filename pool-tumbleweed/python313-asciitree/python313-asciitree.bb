SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python313-asciitree-0.3.3-5.5.noarch.rpm"
RPM_HASH = "7de7ed2d18431c70f702d7eec41840f37aa9ff1593371b5c2d650b50ddf5669b89ee73d28eb1ab17c22127698b2f3e132de8dcb1c27eb7af8a06ff641a22bd79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciitree \
python3.13dist-asciitree \
python313-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
