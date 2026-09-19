SUMMARY = "Sip and eric API files for python314-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python314-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python314-qtdatavis3d-qt5-devel-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "0aacb39e817f5cff5280cbc1d3fa64131b73dd6b004a26e568406115eb293fe3d0b8245be49122ee68a7bff7a3edce9645b488f11450c7ed338560c73cca76b4"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python314-qtdatavis3d-qt5-api \
python314-qtdatavis3d-qt5-devel \
python314-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python314-qt5-devel"

inherit rpm
