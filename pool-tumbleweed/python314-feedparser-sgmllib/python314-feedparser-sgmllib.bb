SUMMARY = "This is sgmllib from Python 2.7. For feedparser use only"
DESCRIPTION = "This is sgmllib from Python 2.7. For feedparser use only."
LICENSE = "Python-2.0"

PV = "2.1.0"

RPM_NAME = "python314-feedparser-sgmllib-2.1.0-1.1.noarch.rpm"
RPM_HASH = "a8adc3b9c3664d77178393218f7c1ccfa55432c4f6c259d4a414bb461c9c0a0e16f1f8e149247e2b3542608b39a7c49abedbfd8292704d48e4ed2c8f599d64c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-feedparser-sgmllib \
python314-feedparser-sgmllib \
python3dist-feedparser-sgmllib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
