SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python313-watchdog-6.0.0-3.5.noarch.rpm"
RPM_HASH = "922a7543eaf9ee89fcebb9cbd6291c66cc084aa415e4128e0a95954a4eab7b044fc49d72051736cc63af67dd88ab65a7f252646eb3dcbba2193925f4850cec59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog \
python3.13dist-watchdog \
python313-watchdog \
python3dist-watchdog"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-pathtools"

inherit rpm
