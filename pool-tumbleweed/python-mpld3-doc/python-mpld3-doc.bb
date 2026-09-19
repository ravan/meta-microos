SUMMARY = "Documentation for python-mpld3"
DESCRIPTION = "Documentation and examples for python-mpld3"
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "python-mpld3-doc-0.5.12-1.4.noarch.rpm"
RPM_HASH = "8acf9f4e9ba79ec1831ae4e40cfc05828db6b9323c784f3ee045903015ba854340bcc0b3fe375cc2e9dd91ef3fd88ddf6fd7ef9d3ed3a3a6d8979ad91c2232da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mpld3-doc \
python313-python-mpld3 \
python314-python-mpld3"

RDEPENDS:${PN} += ""

inherit rpm
