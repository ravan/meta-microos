SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.95.0"

RPM_NAME = "rust1.95-src-1.95.0-1.4.noarch.rpm"
RPM_HASH = "da3a585f5b59b7b3e061187e98bd0d996c201a66c771e70d12a8e3e14d36be0ae908db8497bec0368db2989eef08bf1bbb5c5eb2f34864deea0de40628d90e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.95-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
