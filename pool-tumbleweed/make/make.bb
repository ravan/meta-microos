SUMMARY = "GNU make"
DESCRIPTION = "The GNU make command with extensive documentation."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-4.4.1-3.10.aarch64.rpm"
RPM_HASH = "de1fd29528034ee76b528758eeb73229e557bbc8f2f6513c90be826d2ac7d0e684507d91bb8aff3db69178e5ae0db20e679a7f1e6007bba89f74b1731e24af79"

RPROVIDES:${PN} += "gmake \
make"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
