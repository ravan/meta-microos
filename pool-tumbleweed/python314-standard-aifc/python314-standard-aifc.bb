SUMMARY = "Standard library aifc redistribution. 'dead battery'"
DESCRIPTION = "Standard library aifc redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python314-standard-aifc-3.13.0-2.4.noarch.rpm"
RPM_HASH = "fe89a5dade5da05054d8962ca3a3a6c39af287da16fa590ede0ab916214c8502849dad02fbeb1a0938d26fd21672e59e6df22bb43c0cc78d71c651f1f4b7028e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standard-aifc \
python314-standard-aifc \
python3dist-standard-aifc"

RDEPENDS:${PN} += "python-abi \
python314-audioop-lts \
python314-standard-chunk"

inherit rpm
