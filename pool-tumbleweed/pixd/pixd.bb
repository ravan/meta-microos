SUMMARY = "Colourful visualization tool for binary files"
DESCRIPTION = "pixd is a tool for visualizing binary data using a colour palette. \
It is in a lot of ways akin to a hexdump tool, except using coloured \
squares to represent each octet."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "pixd-1.0.0-1.29.aarch64.rpm"
RPM_HASH = "095dee87844449a72e56722254b45d69db59e7b721e65eed85e10ce85bc1f11a093ace476799b44be02e18c3fd14748a16ea418037c3bebcb2cd165cf20ba2b4"

RPROVIDES:${PN} += "pixd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
