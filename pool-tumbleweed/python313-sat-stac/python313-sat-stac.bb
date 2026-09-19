SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-sat-stac-0.4.1-4.8.noarch.rpm"
RPM_HASH = "e1d825734e32a469d576cba7543bc928468558f47a9b9c646b7142ecdf4935db4f17511a64ce213fa3fe7fd6913de8e00763da56206f2bdef4e83544cd738bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-stac \
python3.13dist-sat-stac \
python313-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-python-dateutil \
python313-requests \
update-alternatives"

inherit rpm
