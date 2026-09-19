SUMMARY = "Installer for Python Build Standalone"
DESCRIPTION = "An installer for @indygreg's python-build-standalone"
LICENSE = "MIT"

PV = "2026.8.14"

RPM_NAME = "python313-pbs-installer-2026.8.14-1.1.noarch.rpm"
RPM_HASH = "430273e85106a73752719dc99a32bf22386b2a3be6d9c282036937bee86684ae6f2432a359c805fdca4fa4cdc990b4d83f78b3695cb762c94c2e333a6b6be0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbs-installer \
python3.13dist-pbs-installer \
python313-pbs-installer \
python3dist-pbs-installer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
