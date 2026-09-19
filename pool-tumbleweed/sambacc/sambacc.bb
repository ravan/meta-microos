SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A set of CLI tools intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.6+git.60.2f89a38"

RPM_NAME = "sambacc-v0.6+git.60.2f89a38-1.5.noarch.rpm"
RPM_HASH = "5ab42ec55cea28a2bc65b09dd25a20eeed7abe5d576b16d52472831b7a9db359077752eb3e5e2186a088bda5a8ccd964e30e2a592fb8679828d942d91a9f72b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sambacc"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python3-sambacc"

inherit rpm
