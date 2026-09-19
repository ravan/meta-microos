SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python314-ipympl-0.10.0-18.1.noarch.rpm"
RPM_HASH = "b07281ca744a04cf1109cf0c8d5967da49528538f62a6345396424d358153d1f900fd6e9dffbb92fa1c0fe1f8acf56442d0521867971cdbac3a07fe88f81b549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipympl \
python314-ipympl \
python314-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python314-ipywidgets >= 7.6.0 with python314-ipywidgets < 9 \
-python314-matplotlib >= 3.5.0 with python314-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python314-Pillow \
python314-ipython \
python314-matplotlib-web \
python314-numpy \
python314-traitlets"

inherit rpm
