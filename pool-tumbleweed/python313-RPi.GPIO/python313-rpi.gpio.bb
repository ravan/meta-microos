SUMMARY = "A module to control Raspberry Pi GPIO channels"
DESCRIPTION = "This package provides a Python module to control the GPIO on a Raspberry Pi."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-RPi.GPIO-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "bd0b8332dabc610249f3af0cbcc0a4851b10b9b03f4a0c631d03ef02322d0f2362c4fb7e77312aeb4ba55fe45a111dd790aae09741855fd89fda8074901a0b3a"

RPROVIDES:${PN} += "python3-RPi.GPIO \
python3.13dist-rpi.gpio \
python313-RPi.GPIO \
python3dist-rpi.gpio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
