SUMMARY = "Library to parse sysconfig setting files"
DESCRIPTION = "This library can be used to parse setting files that follow a trivial \
'KEY=VALUE'-style pattern, similar to what can be found in files \
located in /etc/sysconfig. libdeflt supports values with spaces \
which are not quoted, and which therefore are not always compatible \
with sh."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libdeflt1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "e979c812769f30490b544a062f422158bedf55ea063f1b931f6389d0646ce660aa5159c31b864d2577e0a1ed8572965f5dd7f3ecb6a96f1c3d37060c6cf2fcd2"

RPROVIDES:${PN} += "libdeflt.so.1.0 \
libdeflt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
