SUMMARY = "Development files for python314-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python314-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qt3d-qt5-devel-5.15.6-3.8.aarch64.rpm"
RPM_HASH = "3d880048485c62b71a00c3c0500c8d7d1ead705b61c6d0e4eec2e2e8881a54ed9d3a3e2ba857287b3c8252271d88650ae3c5750905d708e057f72a13125683e9"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python314-qt3d-qt5-api \
python314-qt3d-qt5-devel \
python314-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python314-qt5-devel"

inherit rpm
