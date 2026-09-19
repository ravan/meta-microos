SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.96.1"

RPM_NAME = "rust1.96-src-1.96.1-1.3.noarch.rpm"
RPM_HASH = "cd0ff1ad0b8b170fda1e8538fee0093d4a709aad910d938e0e89fe9c274db36f27c86678156c1f7c4b1915d0d44e9074f63c49613b79f28efd07607bc2536d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.96-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
