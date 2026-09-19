SUMMARY = "Sip and eric API files for python313-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python313-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python313-qtdatavis3d-qt5-devel-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "e148c7cab54ad16259fd2355f2c80792609298f5c3f902a95db027cc809058ad2e77f83e4161cd9510635aab9018b8c00ebab833de9b2f7c3acc1426aee256d0"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python3-qtdatavis3d-qt5-api \
python3-qtdatavis3d-qt5-devel \
python3-qtdatavis3d-qt5-sip \
python313-qtdatavis3d-qt5-api \
python313-qtdatavis3d-qt5-devel \
python313-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python313-qt5-devel"

inherit rpm
