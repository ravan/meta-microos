SUMMARY = "Python package for configuring a python package"
DESCRIPTION = "Donfig is a python library meant to make configuration easier for other \
python packages. Donfig can be configured programmatically, by \
environment variables, or from YAML files in standard locations."
LICENSE = "MIT & BSD-3-Clause"

PV = "0.8.1.post1"

RPM_NAME = "python313-donfig-0.8.1.post1-1.4.noarch.rpm"
RPM_HASH = "28a79cd80d356786c677de8b2606466c2b782eac040b9b2f695ee1fcaca03c08c42a256a3d61e1dc8dac77c628af2d939e4e26a9eb0eb3c9063dea31975fee86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-donfig \
python3.13dist-donfig \
python313-donfig \
python3dist-donfig"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
