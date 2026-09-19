SUMMARY = "Check installation or Live media"
DESCRIPTION = "The program checks installation or Live media for errors."
LICENSE = "GPL-3.0-or-later"

PV = "7.1"

RPM_NAME = "checkmedia-7.1-1.3.aarch64.rpm"
RPM_HASH = "da9caf3978faf22e6465b54c6f119380b89e4e552aacf3b8c300bd4a59c1c8a215fe1a7671550f9a846a968d8912b766c2a707bd68944601acc179f7b8e73b7e"

RPROVIDES:${PN} += "checkmedia"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
libmediacheck.so.7"

inherit rpm
