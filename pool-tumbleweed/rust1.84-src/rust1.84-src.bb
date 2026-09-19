SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.84.1"

RPM_NAME = "rust1.84-src-1.84.1-2.6.noarch.rpm"
RPM_HASH = "5f10e861aff2769dc8199e85e1e63dbd60ba8cfbf9acb3839d4554a71ddbbf5de7039849a0e8180dfb044ccb1b3bc4650b244e13fc1fb8ecf3ec9eab5fd206fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.84-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
