SUMMARY = "Open vSwitch test package"
DESCRIPTION = "Open vSwitch is a software-based Ethernet switch. \
 \
This package contains utilities that are useful to diagnose \
performance and connectivity issues in Open vSwitch setup."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-test-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "b4467484f85fd945e65553990ba0c32b11bae6049b11c44910028329d192f8dca8bca6525d9dbc58aff4e27244943c957201c5a2b7b44f5e3519d47830826cbe"

RPROVIDES:${PN} += "openvswitch-test \
python3-openvswitch-test"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
openvswitch \
python-abi \
python3 \
python3-Twisted \
python3-openvswitch"

inherit rpm
