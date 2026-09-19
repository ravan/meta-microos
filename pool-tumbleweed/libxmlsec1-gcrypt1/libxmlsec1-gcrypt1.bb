SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "GCrypt plugin for XML Security Library provides GCrypt based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "libxmlsec1-gcrypt1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "92f318aa39219eafe59ca336ebd627f6dd57aa4063307ace09f57b02a06d83911ac47b282eaaf6ec52c559426f1846cdc93b55a8d6cd5141e7ef5e3d20a207e6"

RPROVIDES:${PN} += "libxmlsec1-gcrypt.so.1 \
libxmlsec1-gcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libxml2.so.16 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
