SUMMARY = "Shared library for QCDLoop - a one-loop scalar Feynman integrals framework"
DESCRIPTION = "QCDLoop is a library of one-loop scalar Feynman integrals, evaluated close to \
four dimensions. This package provides the shared library for QCDLoop."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "libqcdloop2-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "24a77b313dc84cbd83e2a3d799bcc66796355b5b340cd25d0bd2a8e635e2ff3c6bb64b61727340d3c063f6bc573c6dc88b8822deed5aeb2224d42f1c7145e3b3"

RPROVIDES:${PN} += "libqcdloop.so.2 \
libqcdloop2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
