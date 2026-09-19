SUMMARY = "Utilities to display libinput configuration"
DESCRIPTION = "This tool lists the locally recognised devices and their respective \
configuration options and configuration defaults."
LICENSE = "MIT"

PV = "1.31.3"

RPM_NAME = "libinput-tools-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "a7e092d8969dae252803e173a83d72b1e708b8121fa8c99e45a9bec963fc4d04d76302e9ec8e1420d91df41e81310a88dc63ed4315e7ef3f4d5c2ddc557393f3"

RPROVIDES:${PN} += "libinput-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libinput.so.10 \
libudev.so.1 \
python3-libevdev"

inherit rpm
