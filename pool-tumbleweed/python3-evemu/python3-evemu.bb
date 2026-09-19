SUMMARY = "Python3 bindings for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the Python3 bindings for evemu."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python3-evemu-2.7.0-4.5.aarch64.rpm"
RPM_HASH = "692bd47d1e138cf6a681ef267ff2088f7422a0b9b50f1930e4e8de4c6eaac4dabe1af2fb4ed2cde7c5c6d69f21bb72845710feec116d5f62fdf4403b99a0eef8"

RPROVIDES:${PN} += "python3-evemu"

RDEPENDS:${PN} += "libevemu3 \
python-abi"

inherit rpm
