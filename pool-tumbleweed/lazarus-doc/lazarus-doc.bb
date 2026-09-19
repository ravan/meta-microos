SUMMARY = "Lazarus IDE documentation"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains documentation and example programs for the Lazarus IDE."
LICENSE = "GPL-2.0-or-later"

PV = "4.8"

RPM_NAME = "lazarus-doc-4.8-1.2.aarch64.rpm"
RPM_HASH = "21aec14abec3869de655afa79ea7c6052cd34e1507dc2fdd2b7b5c825ba5fa6e00ff4956a76b389daaf95e4b89fa4d31455b7f95b01492c12a200794b79ff514"

RPROVIDES:${PN} += "lazarus-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
