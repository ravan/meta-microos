SUMMARY = "A module to control Raspberry Pi GPIO channels"
DESCRIPTION = "This package provides a Python module to control the GPIO on a Raspberry Pi."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-RPi.GPIO-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "6a9ae72f2de539ae8f280aa6925df71cc972b7bcd03f428735393b6ae83f60395b2dd4451e48735bf6479dd3a290e93ac827a1c95ee03dd1999b4fce549c2aba"

RPROVIDES:${PN} += "python3.11dist-rpi.gpio \
python311-RPi.GPIO \
python3dist-rpi.gpio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
