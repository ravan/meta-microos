SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.18"

RPM_NAME = "python314-setuptools-gettext-0.1.18-1.2.noarch.rpm"
RPM_HASH = "201b702302bb1ea83c3bf6f6bd0b94fa99dccd674965c71b7a14ecfa805c378181f9c2cce54ea65eabef418e50dfbd1b88d0f45a7b13abbc01b09caa3d78fb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-gettext \
python314-setuptools-gettext \
python3dist-setuptools-gettext"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
