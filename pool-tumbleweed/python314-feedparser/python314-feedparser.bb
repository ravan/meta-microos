SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.14"

RPM_NAME = "python314-feedparser-6.0.14-1.1.noarch.rpm"
RPM_HASH = "7dc4eaf13c8380fc2ffc057c35859dc3ade73228f9cd946ef1f8155242a3374634632fe6715772ac764f4d48e3fe8999b3f1fd22a7c6668af49d29d8b746fe5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-feedparser \
python314-feedparser \
python3dist-feedparser"

RDEPENDS:${PN} += "python-abi \
python314-feedparser-sgmllib"

inherit rpm
