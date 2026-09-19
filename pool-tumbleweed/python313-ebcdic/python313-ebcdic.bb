SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python313-ebcdic-1.1.1-4.5.noarch.rpm"
RPM_HASH = "f853c3787cd789225f601cadbc72b8561ce6700becb81964a0adf99ade19754c49cd499e21ca0daa43212d3e34cd6253a346ef6c09b65f546ff56cc069215585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ebcdic \
python3.13dist-ebcdic \
python313-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
