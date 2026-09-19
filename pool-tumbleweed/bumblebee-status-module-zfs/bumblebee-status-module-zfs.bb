SUMMARY = "Shows zpool information"
DESCRIPTION = "Displays info about zpools present on the system."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-zfs-2.1.5-4.7.noarch.rpm"
RPM_HASH = "84e61622172baea53a1d52c821d100609f46af0563467df77f4998a08fd3ce31743811714d4e603670bb4fad3dd647f886b2c7e9b4f41ff958fe86ae8a1993a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-zfs"

RDEPENDS:${PN} += "bumblebee-status \
python3-setuptools"

inherit rpm
