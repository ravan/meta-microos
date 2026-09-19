SUMMARY = "Build packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the original Debian tools."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-0.9.23-1.12.noarch.rpm"
RPM_HASH = "9e09c95541ada21b6890c263de6d7d502669bb5fe12fd20c7ecfc840bc7ed5b1c772cce753bf4529a07ff32fae7dde7f980957d23bb2bb2037f943db68a3b0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage"

RDEPENDS:${PN} += "/usr/bin/bash \
devscripts \
dpkg \
git-buildpackage-common \
python-abi"

inherit rpm
