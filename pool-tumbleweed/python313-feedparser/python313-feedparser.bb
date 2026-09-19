SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.14"

RPM_NAME = "python313-feedparser-6.0.14-1.1.noarch.rpm"
RPM_HASH = "606842ec6f8e82ddc21bf206baacda991db07ad84b6bce3a56791956dbb10a5138a1f01ec44866a2a2320ce5e51990aa8ec4189a2b80d35c4107174870e3113a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedparser \
python3.13dist-feedparser \
python313-feedparser \
python3dist-feedparser"

RDEPENDS:${PN} += "python-abi \
python313-feedparser-sgmllib"

inherit rpm
