SUMMARY = "Utilities for configuring gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the ratbag utilities allowing to inspect and configure \
mice."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "libratbag-tools-0.18-2.5.aarch64.rpm"
RPM_HASH = "42986545683925ec9576cbf0ef7edd3780c6147cf2b53c116af713b7d9725421a680b25835d0c35b9e0f2827f34de1ceaedd4c15562e8df410958c45f679f55b"

RPROVIDES:${PN} += "libratbag-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblur.so.3 \
python3-evdev \
ratbagd"

inherit rpm
