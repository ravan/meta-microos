SUMMARY = "Nemo extension for Font Manager"
DESCRIPTION = "This package provides integration with the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "nemo-font-manager-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "391d5e3a14162bd9b2ba3cc1ef703f05aee19a9d172f95bae9e9a13a9457414ac80ce5504e3380c468ecc9ae6d3c8700125403c3b2b6c0dcf77580a8afde4ff1"

RPROVIDES:${PN} += "nemo-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnemo-extension.so.1"

inherit rpm
