SUMMARY = "Installer for Python Build Standalone"
DESCRIPTION = "An installer for @indygreg's python-build-standalone"
LICENSE = "MIT"

PV = "2026.8.14"

RPM_NAME = "python314-pbs-installer-2026.8.14-1.1.noarch.rpm"
RPM_HASH = "6af988e10c766746d35afb6c2ef15f69a5ac1a74b9425985ffcceb9a3e76938ea66fd46cd2ee3635c58b25afba8331135065f887b842052a203a8b9e8a23bbdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pbs-installer \
python314-pbs-installer \
python3dist-pbs-installer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
