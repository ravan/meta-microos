SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.1"

RPM_NAME = "python313-relatorio-0.12.1-1.3.noarch.rpm"
RPM_HASH = "707272d9933d349c4075f930fbd8b68d3c6267ef34a547a7227aae248569f67dd5fc2d46102dcee40d1f6113688687a2b64016cce90497c9e4ec0b2f66c68e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-relatorio \
python3.13dist-relatorio \
python313-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Genshi \
python313-PyYAML \
python313-lxml \
python313-pycha \
python313-python-magic \
update-alternatives"

inherit rpm
