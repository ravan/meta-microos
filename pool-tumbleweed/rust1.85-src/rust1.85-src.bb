SUMMARY = "The Rust Standard Library Source"
DESCRIPTION = "Rust Stanard Library Sources are required for building some types of projects"
LICENSE = "Apache-2.0 | MIT"

PV = "1.85.1"

RPM_NAME = "rust1.85-src-1.85.1-2.4.noarch.rpm"
RPM_HASH = "9bbdfcba3983b147fdc7e916a7d0bd45140002bee99a32aa1861321284221b7b62acd9a7c4ff05427f577f6612843f31bfbc96816c6c9d270d43ee60c54890bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rust1.85-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
rust-std"

inherit rpm
