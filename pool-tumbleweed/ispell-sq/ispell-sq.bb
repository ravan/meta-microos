SUMMARY = "Squeeze or unsqueeze a sorted word list"
DESCRIPTION = "This packages includes the tools sq and unsq which can be used to \
squeeze or unsqueeze a sorted word list for better compression."
LICENSE = "BSD-3-Clause"

PV = "3.4.06"

RPM_NAME = "ispell-sq-3.4.06-5.1.aarch64.rpm"
RPM_HASH = "1219005179e7f4a63c6b5917187a68fbb169ed041d8c660aaa7a7fa4d12d343c73924eaeabeefb9f9d5292bf002882b542d21d610a8f437e4bab9e9d74d1176c"

RPROVIDES:${PN} += "ispell-/usr/bin/sq \
ispell-sq"

RDEPENDS:${PN} += "ispell \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
