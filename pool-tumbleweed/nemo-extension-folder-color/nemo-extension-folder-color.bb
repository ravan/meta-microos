SUMMARY = "Nemo extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nemo-extension-folder-color-0.0.88-3.4.noarch.rpm"
RPM_HASH = "1c1388e39ae33ffdeae35a2e29ff9120dd593962f12430ab216f968881231cc1017883c2510169d794fe75ab7e77dd1402bda6c9da12235b68ce54268126b499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-folder-color \
python3.13dist-folder-color-nemo \
python3dist-folder-color-nemo"

RDEPENDS:${PN} += "folder-color-common \
nemo \
python-nemo"

inherit rpm
