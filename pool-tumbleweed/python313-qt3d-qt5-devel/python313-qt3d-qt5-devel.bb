SUMMARY = "Development files for python313-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python313-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qt3d-qt5-devel-5.15.6-3.8.aarch64.rpm"
RPM_HASH = "653a0c7cb45e9e08486bf91d4e3a647d59705fe301eb4b52c774ce64d79cd32ffab171657aaa9d7739920c18076f46389edd3e165c074dfb8bb37214ae5be12e"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python3-qt3d-qt5-api \
python3-qt3d-qt5-devel \
python3-qt3d-qt5-sip \
python313-qt3d-qt5-api \
python313-qt3d-qt5-devel \
python313-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python313-qt5-devel"

inherit rpm
