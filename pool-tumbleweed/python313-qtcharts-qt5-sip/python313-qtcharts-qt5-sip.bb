SUMMARY = "Sip files for python313-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python313-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtcharts-qt5-sip-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "ef0a4fe9556a6500310d720592a2886d0aa183c9f91f266e70842f9f80376a8314f383dd2ce7317fec2d68881d4c96582afc7943a84ab301a9d22e60763d89d2"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python3-qtcharts-qt5-sip \
python313-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python313-qt5-devel"

inherit rpm
