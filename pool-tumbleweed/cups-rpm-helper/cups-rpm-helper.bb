SUMMARY = "RPM macros for building cups drivers"
DESCRIPTION = "RPM helper scripts to create automatic 'Provides:' tags for printer \
driver RPMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "cups-rpm-helper-2.0.4-2.11.aarch64.rpm"
RPM_HASH = "775b6cb5357fe95c0d8b64874eda1c93843d5c82fb53a77ece68f86177c779cf3e71a77ddb9467fbc18e0e6ecb675ba704a2dcd52c17fc2d1a1da66f5578c0af"

RPROVIDES:${PN} += "cups-rpm-helper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-cups \
rpm-build"

inherit rpm
