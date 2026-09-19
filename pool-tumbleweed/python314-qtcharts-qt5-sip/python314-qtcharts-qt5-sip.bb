SUMMARY = "Sip files for python314-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python314-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtcharts-qt5-sip-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "cd1c560b138522d9ff19d8dec98373bfeda87d5bae37be31f70c5f3fa603dea3e12eb4dbf21c568172dfe02094cfd0ca9e78a605c1fe1424ceb2cb0921edaabe"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python314-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python314-qt5-devel"

inherit rpm
