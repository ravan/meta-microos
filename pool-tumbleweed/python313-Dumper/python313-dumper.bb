SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-Dumper-1.2.0-3.5.noarch.rpm"
RPM_HASH = "dc98d2ad4dceef9ba315f4c16962760b108f42b281451866ab4c3bcfa83906c6e4e243fa7583d1ebe434c1ec644b861bdb4940bbaf8be8257c3b24504b7eb3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Dumper \
python3.13dist-dumper \
python313-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
