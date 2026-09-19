SUMMARY = "Steam Locomotive in ASCII art"
DESCRIPTION = "'sl' displays a steam locomotive running across the terminal. \
It is a joke command intended to catch any mistypings of 'ls'."
LICENSE = "ISC"

PV = "5.05"

RPM_NAME = "sl-5.05-1.11.aarch64.rpm"
RPM_HASH = "015a44878168451ab8a4c50cab9f83ca61b0208b62b1a6137565700c6bfd05d5f4e62e45ad202471a46156e2222474d02860cdd5ebd345cd0443af71928a112f"

RPROVIDES:${PN} += "sl"

RDEPENDS:${PN} += "libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
