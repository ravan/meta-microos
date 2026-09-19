SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python314-papermill-2.6.0-2.3.noarch.rpm"
RPM_HASH = "89d63bc6a258a4ee8324ab8adbace4ce354c1f8fdbd62d1dfd3d62a1c05cf94fab9af569e3faf5948ed10465872dff8c93312de681c9b4ce6015ff34a77c85b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-papermill \
python314-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-aiohttp \
python314-ansicolors \
python314-click \
python314-entrypoints \
python314-nbclient \
python314-nbformat \
python314-requests \
python314-tenacity \
python314-tqdm \
update-alternatives"

inherit rpm
