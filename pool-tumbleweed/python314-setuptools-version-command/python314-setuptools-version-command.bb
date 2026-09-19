SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python314-setuptools-version-command-99.9-2.5.noarch.rpm"
RPM_HASH = "d598e84c4f48d27823c5c742463852ba1980f5cc6d367f3bba0e8c4ca8b16b246f645ef291868a4ffa4dc649c5a9e58a2757c3ccadaac82a97100f4cb1c83e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-version-command \
python314-setuptools-version-command \
python3dist-setuptools-version-command"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
