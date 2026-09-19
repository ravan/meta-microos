SUMMARY = "Common files for Extras Plugins for DNF"
DESCRIPTION = "Common files for Extras Plugins for DNF, Python 3 version."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugins-extras-common-4.1.2-1.8.noarch.rpm"
RPM_HASH = "2700f8de9233d705248ef5f9d2d9d17b36e032173cb4fca32498025f95e484b5a219a036217d05dc3c6c4aa6e5c4aa7f0f055a5a8821264cfdfa82e625a9e167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-extras-common \
python3-dnf-plugins-extras-common"

RDEPENDS:${PN} += "python-abi \
python3-dnf"

inherit rpm
