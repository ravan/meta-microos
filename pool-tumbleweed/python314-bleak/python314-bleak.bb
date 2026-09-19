SUMMARY = "Python GATT client"
DESCRIPTION = "Bleak is an acronym for Bluetooth Low Energy platform Agnostic Klient. \
 \
Bleak is a GATT client software, capable of connecting to BLE devices acting as GATT servers. It is designed to provide a asynchronous, cross-platform Python API to connect and communicate with e.g. sensors."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-bleak-1.1.1-1.4.noarch.rpm"
RPM_HASH = "15062fbc3ca843d348de3d2ea7be60249583018aac852c2cfceacb8ff25d94a1d4207091762e2ad9bcadb493cad369f4c61d44c8cc809bf8f66b4c2cc40420d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bleak \
python314-bleak \
python3dist-bleak"

RDEPENDS:${PN} += "python-abi \
python314-dbus-fast"

inherit rpm
