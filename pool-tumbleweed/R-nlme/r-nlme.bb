SUMMARY = "Package provides recommended R-nlme"
DESCRIPTION = "This packages provides R-nlme, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.1.169"

RPM_NAME = "R-nlme-3.1.169-58.3.aarch64.rpm"
RPM_HASH = "c261c4609a34dfc9f3677c10723546291bf0cdbd0a913d5f0742a64518e9a5f8db7721d4c78e9eb9c4c2d52cd076bcb01369a4fe60fe2aca6499758f9a567203"

RPROVIDES:${PN} += "R-nlme"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libm.so.6"

inherit rpm
