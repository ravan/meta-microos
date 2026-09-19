SUMMARY = "Automated Text File Generator"
DESCRIPTION = "AutoGen is a tool designed for generating program files that contain \
repetitive text with varied substitutions.  Its goal is to simplify the \
maintenance of programs that contain large amounts of repetitious text. \
This is especially valuable if there are several blocks of such text that \
must be kept synchronized in parallel tables."
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "autogen-5.18.16-9.5.aarch64.rpm"
RPM_HASH = "0b3e1d01ebdd5eb07b1b9bfddba44d682f5e84b80dfc1a05bd1965c500cb5caa7b1d8a0b5cf31104213534d08bc536d5ef5bb64f15b3aa2d2f4f12d6fd42e379"

RPROVIDES:${PN} += "autogen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libopts.so.25 \
libxml2.so.16"

inherit rpm
