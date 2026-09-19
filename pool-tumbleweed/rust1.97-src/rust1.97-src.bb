SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.97.1"

RPM_NAME = "rust1.97-src-1.97.1-1.3.noarch.rpm"
RPM_HASH = "6b85afa6e273d613b366b8f3bfa10cfcbe4c361a76d27ccd8e44cc5341418a8b766766d602977d5572acd6c7de42ab01b0f8141ff437629c21952bd2997a7b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.97-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
