SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python314-asdf-coordinates-schemas-0.5.1-1.4.noarch.rpm"
RPM_HASH = "700d3326ca91948fbedea689498467b39dfddf8b02821190064f17ef591fae2db747f823027b9f2cfdbe18b47df31409f7a7ed276adcc628cb8e8d244a5c7b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf-coordinates-schemas \
python314-asdf-coordinates-schemas \
python3dist-asdf-coordinates-schemas"

RDEPENDS:${PN} += "python-abi \
python314-asdf \
python314-asdf-standard"

inherit rpm
