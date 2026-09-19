SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python313-cloup-3.1.0-1.2.noarch.rpm"
RPM_HASH = "67ae1ff92cc3333a22c716525529215fc6a74b8e23d6df38f935fe3548b71505dc8dec44bdb69621fec8ab53a923ae4237e3b4f6fdb532a770091cbf11f6158d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloup \
python3.13dist-cloup \
python313-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-typing-extensions"

inherit rpm
