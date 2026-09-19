SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python314-jupyter_console-6.6.3-3.7.noarch.rpm"
RPM_HASH = "3dcaa32ed9d0f12b43a1ef8c8ad677c9b0ca8e17551f8396e928e549afc2db215dba46ed675f3e00db2d23cce72fbc881a4e20093a5ee90d433e0dfbf399c7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-console \
python314-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
jupyter-jupyter-console \
python-abi \
python314-Pygments \
python314-ipykernel \
python314-ipython \
python314-jupyter-client \
python314-prompt-toolkit \
python314-pyzmq \
python314-traitlets \
update-alternatives"

inherit rpm
