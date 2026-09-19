SUMMARY = "Option groups, constraints, subcommand sections and help themes for Click"
DESCRIPTION = "This module adds features to python-click: option groups, \
constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python314-cloup-3.1.0-1.2.noarch.rpm"
RPM_HASH = "33d8f2ab02b9b4e91efcb746dd6acf0c4ae6480618a2d2c162b301076c4c8515622a72bf12008066c8209025a526678fc5a08cdec539af7a86a38ddb52d06d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cloup \
python314-cloup \
python3dist-cloup"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-typing-extensions"

inherit rpm
