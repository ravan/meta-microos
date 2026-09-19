SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python313-setuptools-version-command-99.9-2.5.noarch.rpm"
RPM_HASH = "368da65d99707fcfd814decdbaa819e0c6fbdf9fa1d781d6582249a8f7acd2eddfca53fcc65bb294e37b089e87406d5f4caf8583b7a7c2fbecaed282887b1a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-version-command \
python3.13dist-setuptools-version-command \
python313-setuptools-version-command \
python3dist-setuptools-version-command"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
