SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-pythonfinder-1.3.1-4.5.noarch.rpm"
RPM_HASH = "d491e92e784c94082d00c767198f9c91e55a6ced9ebdfbc4b98b89f24a21aaf72044b353224cf5a92b07095e9f4fd5dc3e2f75b7d8031f466dc7a62698c7ba3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pythonfinder \
python314-pythonfinder \
python3dist-pythonfinder"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-attrs \
python314-cached-property \
python314-click \
python314-packaging \
python314-vistir \
update-alternatives"

inherit rpm
