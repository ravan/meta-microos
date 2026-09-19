SUMMARY = "Example applications for chmlib"
DESCRIPTION = "This package contains examples built on chmlib which may be useful \
to convert chm files from command line."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-examples-0.40-26.5.aarch64.rpm"
RPM_HASH = "4e2d947a73df9ba8a70c80d1cb938f30180eac807e5a9f26575e890728013c09acc6e63acae1227a85d2704c477efceaa5955f810e107eb933bdf50d8cca4163"

RPROVIDES:${PN} += "chmlib-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
libchm0"

inherit rpm
