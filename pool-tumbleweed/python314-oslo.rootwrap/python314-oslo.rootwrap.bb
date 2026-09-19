SUMMARY = "Filtering shell commands to run as root from OpenStack services"
DESCRIPTION = "oslo.rootwrap allows fine-grained filtering of shell commands to run as root \
from OpenStack services."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python314-oslo.rootwrap-7.10.0-1.1.noarch.rpm"
RPM_HASH = "2bb2d7ab778100b7c5937d06d8ff31659ec89d15422e93f9bd36fde2e930d2f2b9cbf5af78f3329c102a28fd35537eb0ab47d975c1f7890edd59c3986d6a97ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.rootwrap \
python314-oslo.rootwrap \
python3dist-oslo.rootwrap"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
