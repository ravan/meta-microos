SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python314-ruamel.base-1.0.0+post1-3.5.noarch.rpm"
RPM_HASH = "91c397c2af3236cfbe89405744b55f73a8b0888730084165218f33873d12a6ac2c8f37fcd1b23e968dccfa42d353107423fa2de6ad80fc68314edb951e01c5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ruamel.base \
python314-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
