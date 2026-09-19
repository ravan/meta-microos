SUMMARY = "Devel files for python313-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python313-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-Charts-devel-6.11.0-1.5.aarch64.rpm"
RPM_HASH = "013d425c725ba0aaccf0ec5ef4f6852bfe502857fae79f2743e94480077fe6b06fffccfada875d22ed607b3334c50a337cf7bc43db3d18edf6f4e7ca7c895d36"

RPROVIDES:${PN} += "python3-PyQt6-Charts-devel \
python313-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python313-PyQt6-devel"

inherit rpm
