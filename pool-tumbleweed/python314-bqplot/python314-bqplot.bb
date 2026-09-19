SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python314-bqplot-0.13.1-15.1.noarch.rpm"
RPM_HASH = "06dc8adbe878db04e8d9d5c43466dc79d64bb378f247bc8fb65117706c5c81b01dccad4555d5b4f9099be31f45e12c1e7f6bc8aafde56525464aeecb9cab7d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bqplot \
python314-bqplot \
python314-jupyter-bqplot \
python3dist-bqplot"

RDEPENDS:${PN} += "-python314-bqscales >= 0.3.3 with python314-bqscales < 4 \
-python314-ipywidgets >= 7.5.0 with python314-ipywidgets < 9 \
jupyter-bqplot-notebook \
python-abi \
python314-numpy \
python314-pandas \
python314-traitlets \
python314-traittypes"

inherit rpm
