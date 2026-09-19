SUMMARY = "Dux Distributed Global Search. A metasearch library that aggregates results from diverse web search services"
DESCRIPTION = "Dux Distributed Global Search. A metasearch library that aggregates results from diverse web search services."
LICENSE = "MIT"

PV = "9.15.0"

RPM_NAME = "python313-ddgs-9.15.0-1.1.noarch.rpm"
RPM_HASH = "e88d11a7e76c626c5d57aae62f5deccd2f683ac68f27043d4a483c6a168ca8e091b3b23d3c109cc091a2f46c509931995738c80c5e22f5753c68bd8badfa0098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddgs \
python3.13dist-ddgs \
python313-ddgs \
python3dist-ddgs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-lxml \
python313-primp"

inherit rpm
