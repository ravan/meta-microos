SUMMARY = "A module to control Raspberry Pi GPIO channels"
DESCRIPTION = "This package provides a Python module to control the GPIO on a Raspberry Pi."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python312-RPi.GPIO-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "6c979c115d20d77b48b80983e6551373ea85fd629f4d03b63835bc9a0e00f85adfa3f2ae902043819f89bc33b0d888e58e482359dd5c7f24babd9a562147e9b4"

RPROVIDES:${PN} += "python3.12dist-rpi.gpio \
python312-RPi.GPIO \
python3dist-rpi.gpio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
