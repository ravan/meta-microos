SUMMARY = "Development files for python314-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python314-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python314-qtnetworkauth-qt5-devel-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "4911f8340480a69c39c2855d73879ab591af4085c459e0bbc56e041023b942b0e8737e5af05f9197d86a09148c3dcbbe3cefede1c77c613e5df90e7e29e6c89a"

RPROVIDES:${PN} += "python314-qtnetworkauth-qt5-devel"

RDEPENDS:${PN} += "python-abi \
python314-qt5-devel \
python314-qtnetworkauth-qt5"

inherit rpm
