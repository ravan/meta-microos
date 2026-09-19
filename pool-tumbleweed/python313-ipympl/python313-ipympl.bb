SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python313-ipympl-0.10.0-18.1.noarch.rpm"
RPM_HASH = "dce80ed05c2b3529e4a8e6498adc5626426f8e0a8333ba7e51c5b362843bcebabf4893015548e6d6cfdf1b903f28796cd2c4eb16fcda97741752fba471d7ced7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipympl \
python3-jupyter-ipympl \
python3.13dist-ipympl \
python313-ipympl \
python313-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python313-ipywidgets >= 7.6.0 with python313-ipywidgets < 9 \
-python313-matplotlib >= 3.5.0 with python313-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python313-Pillow \
python313-ipython \
python313-matplotlib-web \
python313-numpy \
python313-traitlets"

inherit rpm
