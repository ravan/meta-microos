SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-requests-download-0.1.2-5.1.noarch.rpm"
RPM_HASH = "0a6c491053750f7037ba565bddfce73fa47f548cf66561ef37963def42c98cc37508414ef0e883eb7062e2c5bd65bb6c0ccdb2150e06ed1f3e6a648b53d6b251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-download \
python314-requests-download \
python3dist-requests-download"

RDEPENDS:${PN} += "python-abi \
python314-progressbar \
python314-requests"

inherit rpm
