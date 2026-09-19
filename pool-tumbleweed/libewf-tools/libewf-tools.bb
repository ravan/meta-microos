SUMMARY = "Utilities for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "Several tools for reading and writing EWF files. \
It contains tools to acquire, verify and export EWF files."
LICENSE = "LGPL-3.0-or-later"

PV = "20240506"

RPM_NAME = "libewf-tools-20240506-2.22.aarch64.rpm"
RPM_HASH = "fc25a1a8262e6415c7a5c699bac121022a6587bfbb40f8f8f1e4bce82fd5ccf986e9830f832a5e37f632c6caaad74222e63d33cb805c64914e10cf985bdd0809"

RPROVIDES:${PN} += "libewf-tools"

RDEPENDS:${PN} += "/usr/bin/env \
fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcdatetime.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libewf.so.3 \
libfdatetime.so.1 \
libhmac.so.1 \
libodraw.so.1 \
libsmdev.so.1 \
libsmraw.so.1 \
libuna.so.1"

inherit rpm
