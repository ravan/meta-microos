SUMMARY = "Build RPM packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the tools for building RPM packages."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-rpm-0.9.23-1.12.noarch.rpm"
RPM_HASH = "8e4d2dd8c089ce6fef59c76f9745105a2da7c9cfe75cb12217527f6bdaf4ce4584a5639a01a744187d3f84c6c11c4d4671480326aa6a532abf142c10b621c652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-rpm"

RDEPENDS:${PN} += "/usr/bin/sh \
git-buildpackage-common \
python-abi \
python3-rpm \
rpm"

inherit rpm
