SUMMARY = "A 'purl' aka package URL parser and builder"
DESCRIPTION = "A 'purl' aka. package URL parser and builder."
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python314-packageurl-python-0.17.6-1.2.noarch.rpm"
RPM_HASH = "a998e83f3d2de9f5cf6b9d962e59d0693a8e17c1ed2686ee3d3ca54000261e66f3fa389a5a6d97ca082efd38d36729eee381c9d839522b83c9363730c592d31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-packageurl-python \
python314-packageurl-python \
python3dist-packageurl-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
