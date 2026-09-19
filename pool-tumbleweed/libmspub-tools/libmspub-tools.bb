SUMMARY = "Tools to work with publications in Microsoft Publisher file-format"
DESCRIPTION = "Command line tools to work with publications in Microsoft Publisher file-format."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "libmspub-tools-0.1.5-2.3.aarch64.rpm"
RPM_HASH = "5a8803c3adf7e66192117e307cbd39eeeb46bc7cce810ab6100f4d77780ff1957ce7e6726a5dc509c581cab0446e15d8a6933cb004c81785bcf3630de07daf47"

RPROVIDES:${PN} += "libmspub-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmspub-0.1.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
