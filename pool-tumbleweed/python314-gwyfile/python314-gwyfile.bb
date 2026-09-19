SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-gwyfile-0.3.0-1.2.noarch.rpm"
RPM_HASH = "a9dfd797e001fb727c4226f6468cf2dfa1bb08bf8fc720c2d7721c248454130a8c13ff6dde875acf65e8627df39cf5a26998ef910bc85bf0be9e252a0b144bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gwyfile \
python314-gwyfile \
python3dist-gwyfile"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
