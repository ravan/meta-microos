SUMMARY = "Development files for python313-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python313-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python313-qtnetworkauth-qt5-devel-5.15.5-3.7.aarch64.rpm"
RPM_HASH = "f3f4707a2529d54e6259bcca314037c24f1b4a3ccfc44c5f051c559a55489c68af60d88162f8d5f8da0f780e831f62133c00e5c78ea8b4f131a97369b5e9910c"

RPROVIDES:${PN} += "python3-qtnetworkauth-qt5-devel \
python313-qtnetworkauth-qt5-devel"

RDEPENDS:${PN} += "python-abi \
python313-qt5-devel \
python313-qtnetworkauth-qt5"

inherit rpm
