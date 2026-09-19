SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python314-flatdict-4.1.0-1.4.noarch.rpm"
RPM_HASH = "d6da3cbf8ac46431e4786afc4e714e65437990a86aace8f361ad6bb1c14b73b98499c2e90ebe4a3b6884f02a00136b7b9260f30decd00044be734696807212ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flatdict \
python314-flatdict \
python3dist-flatdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
