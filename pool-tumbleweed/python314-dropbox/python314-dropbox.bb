SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "12.0.2"

RPM_NAME = "python314-dropbox-12.0.2-1.5.noarch.rpm"
RPM_HASH = "43096022b4de45121d6ad83dfa1e3947752f1b72b57b8907e5ac65bfa61e99f0d5939cf5e29b63c6750899287660d631838454e08c2d88ace56e69542544b213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dropbox \
python314-dropbox \
python3dist-dropbox"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-stone"

inherit rpm
