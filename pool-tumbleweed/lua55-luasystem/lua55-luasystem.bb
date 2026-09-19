SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "lua55-luasystem-0.6.3-2.3.aarch64.rpm"
RPM_HASH = "4d7d873fb782bc7994c4044b2c61aa985e32cf16f6a67d22e770b4c5f260f775ba30f17bf6ae37e7625c514e37c278cc8528b1cb940617514a4f688e1ce7d665"

RPROVIDES:${PN} += "lua55-luasystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua55"

inherit rpm
