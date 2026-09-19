SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.92.0"

RPM_NAME = "rust1.92-src-1.92.0-3.4.noarch.rpm"
RPM_HASH = "e20677d1df6bb0f46e860f54c1a89b60872b6ea97fdb4bbe352f466281f7c807ff7d8874bc6097e53f1793ca0c1c016aefa2a94f588cfc19a0ee1c73514a10b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.92-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
