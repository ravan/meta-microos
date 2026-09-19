SUMMARY = "Automate maintenance of packages in a Build Service"
DESCRIPTION = "bs-update makes it easier to keep packages in a Build Service \
up-to-date with respect to their upstream sources."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "bs-update-0.18-1.24.noarch.rpm"
RPM_HASH = "1986d35357c4bb5ab6af5c3fb2d99b4d71b0da5e937eb23cb08e9aa475b94ef4f78381f69839c5dfd40000c3c11734851910229697295aa3aeb2d1170b6d3a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bs-update"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
gzip \
osc \
sed \
tar \
wget \
zsh"

inherit rpm
