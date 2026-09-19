SUMMARY = "Python Bindings for babeltrace2"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace2 package."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.1.0"

RPM_NAME = "python3-babeltrace2-2.1.0-2.7.aarch64.rpm"
RPM_HASH = "e66fac48ce36d3ec783406deb6de4f2b68023a5daaab7cd17654506a6c544aed5ab6939224e59f93461cff79bd347624869107d5a6c50fa9812d5328a85f86a8"

RPROVIDES:${PN} += "python3-babeltrace2 \
python3.13dist-bt2 \
python3dist-bt2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
