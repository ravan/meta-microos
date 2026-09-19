SUMMARY = "Advanced Easy-to-Use Asynchronous-Capable DNS Utilities"
DESCRIPTION = "adns includes a collection of useful DNS resolver utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.2"

RPM_NAME = "adns-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "0fdb7163559d215fcf1a4b1047b06706f9d7ac632c0098be2fe0e2d770cf351c5f4c9e0b355dd9085642efbe007c38a1f513868ae683d4961796452a40d1089d"

RPROVIDES:${PN} += "adns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadns.so.1 \
libc.so.6"

inherit rpm
