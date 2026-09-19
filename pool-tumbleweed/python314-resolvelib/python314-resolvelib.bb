SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "1.2.1"

RPM_NAME = "python314-resolvelib-1.2.1-1.4.noarch.rpm"
RPM_HASH = "724fd3f3a3877ba85e5ad1ff2b39708598456cbaa3a7e97ba8d0430128ce88b22ef5bee84a83672a0132d91e98bc5b3c020fb8ad363ccd7022ec280d46611388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-resolvelib \
python314-resolvelib \
python3dist-resolvelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
