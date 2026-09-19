SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-papermill-2.4.0-1.1.noarch.rpm"
RPM_HASH = "8681a2d865bcdc1ecd244edbec38a6123577306a845262e930505de129ec3f2417b3bd7f054fdffc15577a2241dc01a0db6f70f8b2a83230264bb50857220eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-papermill \
python3.10dist-papermill \
python310-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-ansiwrap \
python310-click \
python310-entrypoints \
python310-nbclient \
python310-nbformat \
python310-requests \
python310-tenacity \
python310-tqdm \
update-alternatives"

inherit rpm
