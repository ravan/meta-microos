SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.94.1"

RPM_NAME = "rust1.94-src-1.94.1-1.6.noarch.rpm"
RPM_HASH = "6eab55a94f005146792b8eefd06c05d9e7cf07129a9ed2327d2115c5af459228d0581c6cb2365146056d94f7625c6762385e60f9c08f6571e800fac715c924a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.94-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
