SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.88.0"

RPM_NAME = "rust1.88-src-1.88.0-1.6.noarch.rpm"
RPM_HASH = "93a5121bf58a3314ea2b8c3147839200860a23ccfeea36394cab0e4be20db10bbc5416a18a69e33f4573c8499c3a3be4af45ce289669fd63f536c7ac2123b650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.88-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
