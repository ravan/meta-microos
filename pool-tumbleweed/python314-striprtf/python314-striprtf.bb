SUMMARY = "A simple library to convert rtf to text"
DESCRIPTION = "A simple library to convert rtf to text."
LICENSE = "BSD-3-Clause"

PV = "0.0.33"

RPM_NAME = "python314-striprtf-0.0.33-1.1.noarch.rpm"
RPM_HASH = "b67295619e72d85d0df8ad0d126ca47bdd8f3cefd5abfc0388b8ed9b9097798143cb9de3a94a0919830a64ac844d3975eb4f469b2d7540e5cd80396508567c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-striprtf \
python314-striprtf \
python3dist-striprtf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
