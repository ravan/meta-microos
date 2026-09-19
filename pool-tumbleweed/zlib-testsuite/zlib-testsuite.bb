SUMMARY = "Provide the test examples to reproduce test suite"
DESCRIPTION = "To run the testsuite, execute /usr/libexec/zlib/testsuite \
 \
It should exit 0"
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "zlib-testsuite-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "23d136a6c96d3c181d37c7566deaeb3aca65698d6d537ed07c5ed39b2f0e332897334dc63468ee0acf52a23eafe379628e9da6f428171c91765b2887fa33fe2d"

RPROVIDES:${PN} += "zlib-testsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libz1"

inherit rpm
