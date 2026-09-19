SUMMARY = "3D printer control software: python UI stack"
DESCRIPTION = "Cura is an engine for processing 3D models \
into 3D printing instruction for Ultimaker and other GCode based 3D printers. \
It is part of the larger open source project called 'Cura'. \
 \
Uranium is the Python framework for the Cura UI."
LICENSE = "AGPL-3.0-only"

PV = "3.6.21"

RPM_NAME = "uranium-lulzbot-3.6.21-7.4.aarch64.rpm"
RPM_HASH = "e4e04c517cd90e82cba8cbc55cd493e21401d7dcb670f06cc0b88a6ef52587ec0a81bcbd088aba6c2d0b88896a5548300fc03401c39800ea90d8d204dbdc51d3"

RPROVIDES:${PN} += "uranium-lulzbot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
