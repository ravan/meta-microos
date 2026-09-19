SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python313-bqplot-0.13.1-15.1.noarch.rpm"
RPM_HASH = "f2f86185823e44998234cba70f589ac99eb813e917192d3ea92ca7849f0fbe91c6000c3ff71472b0e8e4d28d0a6eca6badca8c9a0ec2a4eb42450979e803f291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bqplot \
python3-jupyter-bqplot \
python3.13dist-bqplot \
python313-bqplot \
python313-jupyter-bqplot \
python3dist-bqplot"

RDEPENDS:${PN} += "-python313-bqscales >= 0.3.3 with python313-bqscales < 4 \
-python313-ipywidgets >= 7.5.0 with python313-ipywidgets < 9 \
jupyter-bqplot-notebook \
python-abi \
python313-numpy \
python313-pandas \
python313-traitlets \
python313-traittypes"

inherit rpm
