SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "libcppunit_subunit0-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "c20da54533d52e7122b98bda1dd7d9c3cb0227f6c2e7c6aba33b29c6eed29a3ba707526d2230f8b0a6c51331775942b0c02879d1b3122533dca40dc23e94ec5a"

RPROVIDES:${PN} += "libcppunit-subunit.so.0 \
libcppunit-subunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
subunit"

inherit rpm
