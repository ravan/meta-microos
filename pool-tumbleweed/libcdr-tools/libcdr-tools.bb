SUMMARY = "Tools to work with documents in Corel Draw file format"
DESCRIPTION = "Tools to work with documents in Corel Draw file format."
LICENSE = "MPL-2.0"

PV = "0.1.9"

RPM_NAME = "libcdr-tools-0.1.9-1.3.aarch64.rpm"
RPM_HASH = "903f22e58fd4275ff733a940a5cbccf28946195876a8c9e21639649c2110dcf23ea2db093b2bf8fbe3c067f1ea0285f2deb571220270232183067ef0d7916369"

RPROVIDES:${PN} += "libcdr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdr-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
