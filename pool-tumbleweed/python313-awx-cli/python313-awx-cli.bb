SUMMARY = "CLI for the AWX Ansible web platform"
DESCRIPTION = "CLI to manage the AWX Ansible web platform"
LICENSE = "Apache-2.0"

PV = "24.6.1"

RPM_NAME = "python313-awx-cli-24.6.1-1.9.noarch.rpm"
RPM_HASH = "3aca205d3d6e21f367fcecdfd6b5f1e8141d8df9df009de67fd981bd5c696e68ee7199b280260c029fdd440186b40b19056438df312b7c868b97a5f67ac1b0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awx-cli \
python3.13dist-awxkit \
python313-awx-cli \
python3dist-awxkit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-requests \
update-alternatives"

inherit rpm
