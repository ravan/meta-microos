SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.87.0"

RPM_NAME = "rust1.87-src-1.87.0-3.6.noarch.rpm"
RPM_HASH = "fad06674f81e822a4c257fb0a61ccad8b2572b2b2c0dfafdee4d42d2bd469acfd03330dc9e5ef1557f6d8548fbf1941a1a2e4f9879b0378dbd1ccc4bf6d8a4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.87-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
