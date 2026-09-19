SUMMARY = "Enhanced config file parser ala systemd"
DESCRIPTION = "Enhanced config file parser, which merges config files placed \
in several locations into one."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "libeconf0-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "929e934c2da8ca6e50215b9436408a03d88ebfd55306ac00c59804fc58acfbe9f299cc22763e4c5d1a3b5fd794f660442c772ebe581a309c5ab7821d4fef4f1a"

RPROVIDES:${PN} += "libeconf.so.0 \
libeconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
