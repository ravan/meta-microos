SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "12.0.2"

RPM_NAME = "python313-dropbox-12.0.2-1.5.noarch.rpm"
RPM_HASH = "5a26ef70cbbb397504ebc038ac4a289df8042887fbec36ef1c52c120035925bf417ad376b245cc04b08bfc41cc75b7937d09939d13d79320165680d4d4a3e489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dropbox \
python3.13dist-dropbox \
python313-dropbox \
python3dist-dropbox"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-stone"

inherit rpm
