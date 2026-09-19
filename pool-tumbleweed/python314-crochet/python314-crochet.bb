SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-crochet-2.1.1-2.10.noarch.rpm"
RPM_HASH = "1213998afe64cb82b5889cbf810c9533eea8a0fb9bc4157ab0f72dbbe706ac3d57774ea80ae03910c76a23a95d6b2dd7de5acbb4d471e901442707ba6847dd12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crochet \
python314-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python314-Twisted \
python314-wrapt"

inherit rpm
