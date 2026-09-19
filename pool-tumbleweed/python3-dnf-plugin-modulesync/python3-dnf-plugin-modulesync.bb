SUMMARY = "Download module metadata and packages and create repository"
DESCRIPTION = "Download module metadata from all enabled repositories, module artifacts, \
and profiles of matching modules and create repository."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-modulesync-4.10.1-1.6.noarch.rpm"
RPM_HASH = "358d5b978d42c3a25322282763af085f83844c52ebf7f632e2c0acb247d99f5c0301aa3e9833a71ef08ae8a4dd5749a3008984c934ad12f372564c8304b4f477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-modulesync \
dnf-plugin-modulesync \
python3-dnf-plugin-modulesync"

RDEPENDS:${PN} += "createrepo-c \
python-abi \
python3-dnf-plugins-core"

inherit rpm
