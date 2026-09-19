SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.1"

RPM_NAME = "python314-relatorio-0.12.1-1.3.noarch.rpm"
RPM_HASH = "b06bc49c12bdfadf9914e27205ad2a82eacbde1c1602256cc25f820710ead963081056ae1922c203c5ffdfcf80760ca46d89893b8f942a291d299177b46aff0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-relatorio \
python314-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Genshi \
python314-PyYAML \
python314-lxml \
python314-pycha \
python314-python-magic \
update-alternatives"

inherit rpm
