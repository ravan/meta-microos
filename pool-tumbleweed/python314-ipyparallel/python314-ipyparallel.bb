SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "9.2.0"

RPM_NAME = "python314-ipyparallel-9.2.0-1.1.noarch.rpm"
RPM_HASH = "90d7de33641288dbc71b2fbccd90790fde150d7344d11b6272e6e309cc0c1b976728e0f8d2f540ba787d53ed9b92963f2088d06708734d69007af34ff3af7088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyparallel \
python314-ipyparallel \
python314-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-decorator \
python314-ipykernel \
python314-ipython \
python314-jupyter-client \
python314-psutil \
python314-python-dateutil \
python314-pyzmq \
python314-tornado \
python314-tqdm \
python314-traitlets \
update-alternatives"

inherit rpm
