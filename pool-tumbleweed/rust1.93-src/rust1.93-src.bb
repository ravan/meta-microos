SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.93.0"

RPM_NAME = "rust1.93-src-1.93.0-3.6.noarch.rpm"
RPM_HASH = "a1ee8363d533ebb79d1b40f8f9d9e1c1f0d08f2fb8512aad4ce114100eea2b2d6fe500a98d0830f670f9eea7eee12e3d7d551c3bcfda67b55c4ef226a0f8ea6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.93-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
