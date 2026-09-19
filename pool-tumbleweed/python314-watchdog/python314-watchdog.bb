SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python314-watchdog-6.0.0-3.5.noarch.rpm"
RPM_HASH = "42c4e0947677938400af07d192fc435810a27c3178da68e1a05dfba5c02726050b71aa5fddf360cb2513a2e68eab4cb50dab9c56435130e981f116a66c2829bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-watchdog \
python314-watchdog \
python3dist-watchdog"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-pathtools"

inherit rpm
