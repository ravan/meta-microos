SUMMARY = "Ansible Configuration Management Database"
DESCRIPTION = "Ansible-cmdb takes the output of Ansible's fact gathering and converts it into \
a static HTML overview page (and other things) containing system configuration \
information. \
It supports multiple types of output (html, csv, sql, etc) and extending \
information gathered by Ansible with custom data. For each host it also shows \
the groups, host variables, custom variables and machine-local facts."
LICENSE = "GPL-3.0-or-later"

PV = "1.31"

RPM_NAME = "ansible-cmdb-1.31-3.4.noarch.rpm"
RPM_HASH = "276cd53428fd12fb980ca65db63f15c6a1e97a6d7ea10398e97a8205832cdabd54017bd10cdd0e538f2f9e4b17aee9051b20bd774f429f63839637af9dcd3043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-cmdb \
python3.13dist-ansible-cmdb \
python3dist-ansible-cmdb"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Mako \
python3-PyYAML \
python3-jsonxs"

inherit rpm
