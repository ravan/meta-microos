SUMMARY = "Library to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.5.5"

RPM_NAME = "libyara10-4.5.5-1.4.aarch64.rpm"
RPM_HASH = "a002093582fb3795e4b9c9299f2cba2fea98e3304c040569de3b35352da36fe340e17ac790b8fe568627267a3e23db80911fb03ba13b241ead50fa8725dc83bd"

RPROVIDES:${PN} += "libyara.so.10 \
libyara10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6 \
libmagic.so.1"

inherit rpm
