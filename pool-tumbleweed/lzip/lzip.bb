SUMMARY = "Lossless Data Compressor based on the LZMA Algorithm"
DESCRIPTION = "Lzip is a lossless data compressor based on the LZMA algorithm, with very safe \
integrity checking and a user interface almost identical to the one of \
bzip2. Lzip is only a data compressor, not an archiver. It has no facilities \
for multiple files, encryption, or archive-splitting, but, in the Unix \
tradition, relies instead on separate external utilities such as GNU Tar for \
these tasks."
LICENSE = "GPL-2.0-or-later"

PV = "1.26"

RPM_NAME = "lzip-1.26-1.3.aarch64.rpm"
RPM_HASH = "3c8476e1aec4048863f1f52cfaa0af3aa748ce62fcf100bbfbbf8daef16e3968ba359847c3257bcdd281f5aa3e195c5b38f019a939721f46de7ccdfda3b8f565"

RPROVIDES:${PN} += "lzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
