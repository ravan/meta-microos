SUMMARY = "Tools to transform EOT font files into other formats"
DESCRIPTION = "Tools to transform EOT font files into other formats. Only TTF is \
supported currently."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot-tools-0.01-1.38.aarch64.rpm"
RPM_HASH = "449290e4ffed143ef21f0314e97cf0107282d7b4fdd05b701be34e5086f0f018aa6a0bacc469176441e81659cf6965af1b28cc45bb2c3c41f0dc9440cd9bacb3"

RPROVIDES:${PN} += "libeot-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeot.so.0"

inherit rpm
