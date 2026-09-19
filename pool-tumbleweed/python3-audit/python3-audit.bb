SUMMARY = "Python3 Bindings for libaudit"
DESCRIPTION = "The audit-libs-python3 package contains the bindings for using libaudit \
by python3."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "python3-audit-4.0.2-3.5.aarch64.rpm"
RPM_HASH = "10b328e0d8cbc790b10f1ec59ad40ef2ae2ed1fc93796aec5cfce4355a125347d8d2666e4f2880c85b027f663b46b69a6d99461763aba3af3c5403a81de485db"

RPROVIDES:${PN} += "audit-libs-python3 \
python3-audit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudit.so.1 \
libauparse.so.0 \
libc.so.6 \
python-abi"

inherit rpm
