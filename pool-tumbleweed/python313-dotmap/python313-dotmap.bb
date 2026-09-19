SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python313-dotmap-1.3.30-2.5.noarch.rpm"
RPM_HASH = "eb998daab4e97d2e3d3ef19d1cfbe4a516cd9f0a83e3f90f4e4c668be0c3ddc4d371b6ce2d6d6cf5405632d29e1702fff528a6d72b47d03b9f5bf44c2489763d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dotmap \
python3.13dist-dotmap \
python313-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
