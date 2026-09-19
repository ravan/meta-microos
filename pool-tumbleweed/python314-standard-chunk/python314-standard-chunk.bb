SUMMARY = "Standard library chunk redistribution. 'dead battery'"
DESCRIPTION = "Standard library chunk redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python314-standard-chunk-3.13.0-2.4.noarch.rpm"
RPM_HASH = "0ca06624ec6b15c872cf77519d8eed1557756826b3aeac2f1ba119c8fcb74fcc69ee4cbd1b4020c6904dd28966eb3c8a75e7ead7d6987d02fdf5b1268d0d686b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standard-chunk \
python314-standard-chunk \
python3dist-standard-chunk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
