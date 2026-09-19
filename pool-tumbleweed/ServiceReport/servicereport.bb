SUMMARY = "A tool to validate and repair First Failure Data Capture (FFDC) configuration"
DESCRIPTION = "ServiceReport is a python based tool that investigates the incorrect \
First Failure Data Capture (FFDC) configuration and optionally repairs \
the incorrect configuration"
LICENSE = "GPL-2.0-only"

PV = "2.2.4+git12.bc007b2"

RPM_NAME = "ServiceReport-2.2.4+git12.bc007b2-2.2.noarch.rpm"
RPM_HASH = "eddd81f22c5efdc0a937b56047ff9748943333ec1e7b2839513216c1d96c5f42ff13041c231cad0b1a5bb9d1e386558dee27cf5c41e900e4130ce2e0e8ac0633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ServiceReport \
python3.13dist-servicereport \
python3dist-servicereport"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
systemd"

inherit rpm
