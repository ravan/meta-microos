SUMMARY = "A PEP8 equivalent for bash scripts"
DESCRIPTION = "A PEP8 equivalent for bash scripts \
 \
This program attempts to be an automated style checker for bash scripts \
to fill the same part of code review that pep8 does in most OpenStack \
projects. It started from humble beginnings in the DevStack project, \
and will continue to evolve over time. \
 \
- Documentation: http://docs.openstack.org/developer/bashate \
- Source: http://git.openstack.org/cgit/openstack-dev/bash8 \
- Bugs: http://bugs.launchpad.net/bash8"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python314-bashate-2.1.1-3.5.noarch.rpm"
RPM_HASH = "6bb5d9a953301e1bba7d8e3db8f995951f810a4c682eeb0903cdebfc97e7d10b225a3b4e032601010e053c18eb1932e5b8273466b3bb0fc88d1c34a47f7273b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bashate \
python314-bashate \
python3dist-bashate"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Babel \
python314-pbr"

inherit rpm
