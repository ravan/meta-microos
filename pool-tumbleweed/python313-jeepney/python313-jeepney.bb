SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-jeepney-0.9.0-1.5.noarch.rpm"
RPM_HASH = "d7a397855f1d83827d7828a0f5e8c4ddadc53414752b05c621b2f201cfa014c5a16a2fe31e0e0222f1101099336bf0766e73838b6e6c71793e7148320643fc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jeepney \
python3.13dist-jeepney \
python313-jeepney \
python3dist-jeepney"

RDEPENDS:${PN} += "python-abi"

inherit rpm
