SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python314-vim-vint-0.3.21-6.10.noarch.rpm"
RPM_HASH = "152fbab9e87a8180791467a622e9074013eb56c7d1175dbfc97621db2e11d0f1d4c26ba3b7536abdfc71f2f49cb8527c0b70d6070978bf057b847810b2f98cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vim-vint \
python314-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-ansicolor \
python314-chardet \
update-alternatives"

inherit rpm
