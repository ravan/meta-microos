SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-texttable-1.7.0-1.12.noarch.rpm"
RPM_HASH = "f0e9d94cb68f707a3b8baad6149eaa528d8cf34a80e4a9a649c14948621cf90b98c20459206c762f57b595557e331de33d96034ccb94e571d8bbe9ac5d523a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-texttable \
python314-texttable \
python3dist-texttable"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
