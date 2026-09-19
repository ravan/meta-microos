SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-jeepney-0.9.0-1.5.noarch.rpm"
RPM_HASH = "59ac760608a1628cb7cedd4ac2be4e4363d485412947f51fdf6ac5d45c7e723edb76517617c1925afcaab16c3a6a7ea1e7191bee56c52318bef6756f7f2793a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jeepney \
python314-jeepney \
python3dist-jeepney"

RDEPENDS:${PN} += "python-abi"

inherit rpm
