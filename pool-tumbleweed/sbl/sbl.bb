SUMMARY = "Screen reader for the Linux console"
DESCRIPTION = "SUSE blinux is a screen reader for the Linux console. It supports \
braille displays."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-3.5.0.20130317.git7a75bc29-10.4.aarch64.rpm"
RPM_HASH = "255ca61b1082c2f335199dab12b59191aab1ad09401abf67ee5dacbf57480e247ba669757516d7e5e4ce54efa6b4936a0a5f63af94414b7f5b582128adb4c19b"

RPROVIDES:${PN} += "config-sbl \
libbrld.so.1 \
libsbl-alva.so.2 \
libsbl-alvausb.so.2 \
libsbl-baum.so.2 \
libsbl-fhp-usb.so.2 \
libsbl-fhp.so.2 \
libsbl-ht.so.2 \
libsbl-none.so.2 \
libsbl-pwrbrl.so.2 \
libsbl-tieman.so.2 \
sbl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
