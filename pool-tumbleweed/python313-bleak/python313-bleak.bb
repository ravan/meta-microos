SUMMARY = "Python GATT client"
DESCRIPTION = "Bleak is an acronym for Bluetooth Low Energy platform Agnostic Klient. \
 \
Bleak is a GATT client software, capable of connecting to BLE devices acting as GATT servers. It is designed to provide a asynchronous, cross-platform Python API to connect and communicate with e.g. sensors."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-bleak-1.1.1-1.4.noarch.rpm"
RPM_HASH = "800c28dcaf3b0d98633216d37bdc9273f8aed6eb45cb617cb975ddc919c0acfad4241b69955b6814ab6b380d4363b50cf058627fcceb320983cfaad7eafb7352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bleak \
python3.13dist-bleak \
python313-bleak \
python3dist-bleak"

RDEPENDS:${PN} += "python-abi \
python313-dbus-fast"

inherit rpm
