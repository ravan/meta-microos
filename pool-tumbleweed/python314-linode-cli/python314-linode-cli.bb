SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.65.0"

RPM_NAME = "python314-linode-cli-5.65.0-1.3.noarch.rpm"
RPM_HASH = "dd86e6c855f9b9b9d2de713cb25a53f70493b8809f6772d846219d3204e3208b763e81acbe379b6d13ac074b16f2fd93204a17e6149e7a9acb8ae3cd7c4b2ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-linode-cli \
python314-linode-cli \
python3dist-linode-cli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-linode-metadata \
python314-openapi3 \
python314-packaging \
python314-pytimeparse \
python314-requests \
python314-rich \
update-alternatives"

inherit rpm
