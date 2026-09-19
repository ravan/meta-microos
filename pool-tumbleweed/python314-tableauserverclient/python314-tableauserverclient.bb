SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.41"

RPM_NAME = "python314-tableauserverclient-0.41-1.2.noarch.rpm"
RPM_HASH = "784efae9eeeba4791b9f94972c8507cf90b83eab006c1cf348a14ddff6f95eeb74d47e3267fd1422affd4fc248658fe772fcd38c00bb7e4fb96a6cc81e37a13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tableauserverclient \
python314-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python314-defusedxml \
python314-packaging \
python314-requests \
python314-typing-extensions \
python314-urllib3"

inherit rpm
