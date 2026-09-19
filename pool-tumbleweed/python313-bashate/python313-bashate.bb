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

RPM_NAME = "python313-bashate-2.1.1-3.5.noarch.rpm"
RPM_HASH = "3df923f171663cd27c66d487edd50104148a6811ffabf62bc0362c1e1465f5b88d8bcf4d999432d9f5cd0600a71168d6c36006a0c549b470dbbd506b517cec2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bashate \
python3.13dist-bashate \
python313-bashate \
python3dist-bashate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Babel \
python313-pbr"

inherit rpm
