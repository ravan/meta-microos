SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.91.0"

RPM_NAME = "rust1.91-src-1.91.0-3.7.noarch.rpm"
RPM_HASH = "b9c9b0b2619c467ef0360add363aa1a4b0cea1e3be8ec109385aa77672a8fd574659df9e58d0636d14b7979a9c0d46f336cad2a96686d29b24740f19f9851521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.91-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
