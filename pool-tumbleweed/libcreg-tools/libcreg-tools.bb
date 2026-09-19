SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20260523"

RPM_NAME = "libcreg-tools-20260523-1.10.aarch64.rpm"
RPM_HASH = "44a354adf7688fd9e6e7aebdec8dc3c476bf5046372d000c8c82dde4c1b8f4cc828a4058eeae54f56149acc41462b98897270091b36f7c23bb18c151899abe84"

RPROVIDES:${PN} += "libcreg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcreg.so.1 \
libfuse3.so.4 \
libuna.so.1"

inherit rpm
