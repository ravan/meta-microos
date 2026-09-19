SUMMARY = "Typing stubs for PyYAML"
DESCRIPTION = "Typing stubs for PyYAML"
LICENSE = "Apache-2.0"

PV = "6.0.12.20240917"

RPM_NAME = "python314-types-PyYAML-6.0.12.20240917-2.5.noarch.rpm"
RPM_HASH = "b30de28c30f74356cd155e9736bb87e89b73b5bc92f257f7737bc4fb9c7c58337cf8b66d6141f6e83f028d0c06a3028c21cb359be719680d63b37884134ca599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-pyyaml \
python314-types-PyYAML \
python3dist-types-pyyaml"

RDEPENDS:${PN} += ""

inherit rpm
