SUMMARY = "Library for a lightweight and flexible command-line JSON processor"
DESCRIPTION = "Library for a lightweight and flexible command-line JSON processor."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.8.2"

RPM_NAME = "libjq1-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "a120d29379db552fd42f17f9067170429330a79bc35506ca3a6c674ee1afb8aa1eaa0232a04b36f2642bcc51526a6a0a1816b7030946fc349673c0df5707a20f"

RPROVIDES:${PN} += "libjq.so.1 \
libjq1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libonig.so.5"

inherit rpm
