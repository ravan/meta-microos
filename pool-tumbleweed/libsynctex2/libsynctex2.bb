SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-120.4.aarch64.rpm"
RPM_HASH = "33acff739c5b33e80409c1e6abb66025b10d35c362a7779eca76699eca9483e4b74310c98cd77e961fd8f27e10eb7aeb8923c60fbecda085a8d7c285e666f052"

RPROVIDES:${PN} += "libsynctex.so.2 \
libsynctex2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
