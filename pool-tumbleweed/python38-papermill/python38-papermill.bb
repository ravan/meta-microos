SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python38-papermill-2.4.0-1.1.noarch.rpm"
RPM_HASH = "62f93d2b8dabbe5fdd3dd0744987b557d0c8ab7e8e2847c863fb0c13bb3cdf4d2384c12233f1be5ace110828fe144d20556af9da36a9eade21fb4028e09ca0ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-papermill \
python38-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-PyYAML \
python38-ansiwrap \
python38-click \
python38-entrypoints \
python38-nbclient \
python38-nbformat \
python38-requests \
python38-tenacity \
python38-tqdm \
update-alternatives"

inherit rpm
