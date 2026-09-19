SUMMARY = "CLI for the AWX Ansible web platform"
DESCRIPTION = "CLI to manage the AWX Ansible web platform"
LICENSE = "Apache-2.0"

PV = "24.6.1"

RPM_NAME = "python314-awx-cli-24.6.1-1.9.noarch.rpm"
RPM_HASH = "e0afea9553d9a829068d1cddbec2de5dedf3bb42482d7a64b13b0436475049a772ba290a58ce37e24546b0d0852c0d3bc88d1ce10f3d8de326c3c5719eaf24cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-awxkit \
python314-awx-cli \
python3dist-awxkit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-requests \
update-alternatives"

inherit rpm
