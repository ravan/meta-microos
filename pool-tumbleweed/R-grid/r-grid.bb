SUMMARY = "Package providing R-grid graphics in R-grid"
DESCRIPTION = "This package provides R-grid, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-grid-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "797413df912c33b1420fd29e6bf7fa314462a0c6703025f39c3b0cbff93f62e3c8269cfbbbc95bcc434a803a4bc59343b314183ebbdb619b7a0e96bd48d375d0"

RPROVIDES:${PN} += "R-grid"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
