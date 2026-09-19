SUMMARY = "Dux Distributed Global Search. A metasearch library that aggregates results from diverse web search services"
DESCRIPTION = "Dux Distributed Global Search. A metasearch library that aggregates results from diverse web search services."
LICENSE = "MIT"

PV = "9.15.0"

RPM_NAME = "python314-ddgs-9.15.0-1.1.noarch.rpm"
RPM_HASH = "e497a5b51134905bf5b908e545ba264667d6a79c9a4bfad32bc8914b183ce91750f2d2da5f5689ee063e64fd692ebbe8ee51387f9af34456c87002591e966629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ddgs \
python314-ddgs \
python3dist-ddgs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-lxml \
python314-primp"

inherit rpm
