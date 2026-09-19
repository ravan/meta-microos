SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.48"

RPM_NAME = "python314-magic-5.48-2.1.noarch.rpm"
RPM_HASH = "5e1a33d105855d4786f870fefbb78af3226094afdf5601d9166b15f18acef2f0180f9745611028803b806e6dcb639fe2ad43063cf300c9bdc351a6e18686c5d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-file-magic \
python314-file-magic \
python314-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
