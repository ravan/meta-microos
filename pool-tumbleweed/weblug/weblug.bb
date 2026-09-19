SUMMARY = "Simple webhook receiver program"
DESCRIPTION = "Simple webhook receiver program"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "weblug-0.5-2.8.aarch64.rpm"
RPM_HASH = "581cdcc99c2bbb5d92d9420570018248b52fc4a1194c270470485ed46c93a8b7be73bc27bda0cc19b5021faa8d4f9063cd80411add16552be0927811f68d83e1"

RPROVIDES:${PN} += "config-weblug \
weblug"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
