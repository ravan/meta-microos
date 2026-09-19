SUMMARY = "notify-send alternative"
DESCRIPTION = "FYI (for your information) is a command line utility to send desktop \
notifications to the user via a notification daemon implementing XDG \
desktop notifications."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "fyi-1.0.4-2.3.aarch64.rpm"
RPM_HASH = "ad5ec6bd4f05e2516df63d2f7e44ccef68574bcfd9881f2eb02f479d184e0b8336d98d180aa48bd96d141d89a95513dde672e3a7b51cefdd476acd7e35cd536d"

RPROVIDES:${PN} += "fyi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
