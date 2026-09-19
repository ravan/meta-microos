SUMMARY = "A wrapper for the GNU Privacy Guard (GPG or GnuPG)"
DESCRIPTION = "This module allows access to GnuPG's key management, \
encryption and signature functionality from Python programs."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python313-python-gnupg-0.5.6-2.1.noarch.rpm"
RPM_HASH = "9ac901ebf1e66ff5617a7e0e3da425c59f89f6328b32c893c4476aa83944b162f2bfcb5298e70bfdb8b29400de519bd90caec79d56852d8b268916ace86683f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gnupg \
python3-python-gnupg \
python3.13dist-python-gnupg \
python313-gnupg \
python313-python-gnupg \
python3dist-python-gnupg"

RDEPENDS:${PN} += "gpg2 \
python-abi"

inherit rpm
