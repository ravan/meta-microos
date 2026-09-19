SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.6+git.60.2f89a38"

RPM_NAME = "python313-sambacc-v0.6+git.60.2f89a38-1.5.noarch.rpm"
RPM_HASH = "947a8cdeed61779139b93f12541fe715672d6f1cfe69343196b916500aa23c85eef97f958a45e95e73b7585901f122de79422a9a9b82c8dfc5d60c7edd67be77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sambacc \
python313-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
