SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "9.2.0"

RPM_NAME = "python313-ipyparallel-9.2.0-1.1.noarch.rpm"
RPM_HASH = "9d2dbc63782b38bafc13f105cb0cdbb99863fc74835876081462e5c8fbf13fd82eca70bc63db35d3d50bb4c4d9dfa522e6139322ebf5d6aac33bb47a8b2d0ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyparallel \
python3-jupyter-ipyparallel \
python3.13dist-ipyparallel \
python313-ipyparallel \
python313-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-decorator \
python313-ipykernel \
python313-ipython \
python313-jupyter-client \
python313-psutil \
python313-python-dateutil \
python313-pyzmq \
python313-tornado \
python313-tqdm \
python313-traitlets \
update-alternatives"

inherit rpm
