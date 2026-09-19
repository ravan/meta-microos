SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.6+git.60.2f89a38"

RPM_NAME = "python314-sambacc-v0.6+git.60.2f89a38-1.5.noarch.rpm"
RPM_HASH = "7b96ffb05cee835b97b661747cb8edb305b63381a06f0cf39373acb6fa8a3a9b7e26f16d383165b47f9da653c057b9b267944ad1c03dc26045ffdb49fb96261d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
