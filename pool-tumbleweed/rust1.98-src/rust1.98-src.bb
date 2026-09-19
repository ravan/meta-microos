SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.98.1"

RPM_NAME = "rust1.98-src-1.98.1-1.1.noarch.rpm"
RPM_HASH = "bb7d168a84dbe4bf33d2fbf08d6c744075b370a8e7745684aaf0e22fa4f98e1035a64d0ed693fdad26a3bc24c992d91b95dfbe529292a4418c7a9beef49a1c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.98-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
rust-std"

inherit rpm
