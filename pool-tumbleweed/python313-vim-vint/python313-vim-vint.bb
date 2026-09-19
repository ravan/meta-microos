SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python313-vim-vint-0.3.21-6.10.noarch.rpm"
RPM_HASH = "8db504a2943c2dc8e644b48af25679fbea8b3d764afaee239eb50f7da7c12bebd74087f436cb360e28b8bae835f24d15c8569f87d2607e2289333368af74df9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vim-vint \
python3.13dist-vim-vint \
python313-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-ansicolor \
python313-chardet \
update-alternatives"

inherit rpm
