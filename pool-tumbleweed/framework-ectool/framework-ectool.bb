SUMMARY = "ectool for the Framework laptop"
DESCRIPTION = "ectool for the Framework laptop. It allows setting the fan speed \
or battery charge limits."
LICENSE = "MIT"

PV = "1+git20240623.0ac6155"

RPM_NAME = "framework-ectool-1+git20240623.0ac6155-1.5.aarch64.rpm"
RPM_HASH = "3b2b63ffde58d52a205008ff51ded388ba8e235cc0f7f3a1114f4cd9ea718afb3e0c61acf68027c070401c6edf7b1646f4d7951cfd1124b3060a96143af9cd2c"

RPROVIDES:${PN} += "ectool \
framework-ectool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
