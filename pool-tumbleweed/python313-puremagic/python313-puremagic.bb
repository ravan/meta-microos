SUMMARY = "Pure python implementation of magic file detection"
DESCRIPTION = "Pure python implementation of magic file detection"
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-puremagic-2.2.0-2.2.noarch.rpm"
RPM_HASH = "625fafadd8ca1427560b5ea7e9f116e89b746707e8455faa92afe13c0c453b716b54e595ff13af7d5a24e111abf7717cb702cd0831bd2ae4c7cfb548dd3adf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-puremagic \
python3.13dist-puremagic \
python313-puremagic \
python3dist-puremagic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
