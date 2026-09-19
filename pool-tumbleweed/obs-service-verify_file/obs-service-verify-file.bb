SUMMARY = "An OBS source service: file verification"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It allows to verify a file with a given sha256sum"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "obs-service-verify_file-0.1.1-3.10.noarch.rpm"
RPM_HASH = "ca1a392f1c0bab162c51da34464db0235b7b78b82a61c76ed3ca2607f39b3317cc6f939137d128cd6e75078eb57730ad1fa50b2d85d49fbbb5c06996517d39e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-verify-file"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils"

inherit rpm
