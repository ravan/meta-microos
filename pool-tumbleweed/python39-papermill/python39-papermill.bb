SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-papermill-2.4.0-1.1.noarch.rpm"
RPM_HASH = "99db4014b11259674219e959f83af73291ac21ec840db38af653ee66c0122df26d8fd9169348901ff4bfdcc42489d66248de3ccff3cf605e3ad83225b3b76409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-papermill \
python39-papermill \
python3dist-papermill"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-ansiwrap \
python39-click \
python39-entrypoints \
python39-nbclient \
python39-nbformat \
python39-requests \
python39-tenacity \
python39-tqdm \
update-alternatives"

inherit rpm
