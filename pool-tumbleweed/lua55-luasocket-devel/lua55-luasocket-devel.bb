SUMMARY = "Header files for lua55-luasocket"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua55-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua55-luasocket-devel-3.1.0-5.3.aarch64.rpm"
RPM_HASH = "046569a8123b2f4d4eeedc2a0a627696c86e10e64b004abe8f94e515492b9a7ae3a1ff701f0465df67c2fa9d45dc62cf7d1c3bace01e44be2ec3fbcb62fc5777"

RPROVIDES:${PN} += "lua55-luasocket-devel"

RDEPENDS:${PN} += "lua55-luasocket"

inherit rpm
