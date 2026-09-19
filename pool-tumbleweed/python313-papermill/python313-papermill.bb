SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python313-papermill-2.6.0-2.3.noarch.rpm"
RPM_HASH = "0822678b3b5afc6d1217af8d5c78c4cc1b5bbdef0f3881ed8f391f21595362b8e1077e0864ea3a5b68e47250e66ab3dc2c559da13b19fb3e0ccbc311d95214b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-papermill \
python3.13dist-papermill \
python313-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-aiohttp \
python313-ansicolors \
python313-click \
python313-entrypoints \
python313-nbclient \
python313-nbformat \
python313-requests \
python313-tenacity \
python313-tqdm \
update-alternatives"

inherit rpm
