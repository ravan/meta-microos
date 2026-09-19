SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.86.0"

RPM_NAME = "rust1.86-src-1.86.0-3.6.noarch.rpm"
RPM_HASH = "0ed208e9c00cfaf183494da6467d5372a551cb483b86bdfa31e8cce13a5a8382329d910e2d2dd45f9c1a6f6b8ad982c4bfaf5bff569b85b2efebae4ee0f18d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.86-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
