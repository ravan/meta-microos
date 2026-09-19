SUMMARY = "Boost.IOStreams Runtime Libraries"
DESCRIPTION = "This package contains the Boost.IOStreams Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_iostreams1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "52aba8c785ee0969081cdba82d59e01a03ac5cfdd21d88707ed69904c85a6d89758ab117e3928673f79a38d684f24bb544b7404f0a2079a4ef60d28697248787"

RPROVIDES:${PN} += "libboost-iostreams.so.1.91.0 \
libboost-iostreams1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
