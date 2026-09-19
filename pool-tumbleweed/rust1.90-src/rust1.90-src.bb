SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.90.0"

RPM_NAME = "rust1.90-src-1.90.0-2.6.noarch.rpm"
RPM_HASH = "c743db3208420d5b9f9f7534ec821f230ec7ba9aa70fdeb5010cff8fd0461d8e2acae5ee4e53e8ec7db3a2e535501db41c49582b9dc9645a649bb6c16a6af791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.90-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
