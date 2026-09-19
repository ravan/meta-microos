SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.16"

RPM_NAME = "python314-merge3-0.0.16-1.4.noarch.rpm"
RPM_HASH = "ed0d2d18fec98ce823bcc1b3d461e50fb18490cbc1a5af3646020685a2b047c27add713adbc22c500cb9cfc92f5079ec76f55334f525af00103e6c0aad018e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-merge3 \
python314-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
