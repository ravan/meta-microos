SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "jupyter-matplotlib-0.11.7-18.1.noarch.rpm"
RPM_HASH = "f1fd3f929b4159c2b9ecb66d82f42d6e7b8adbc45637f89de37ff692de094ff7f51262a35f9cd88e13ccc18ab32a6512eee2cd1b04bdbd4bd7d88c9910c0ff14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl \
jupyter-matplotlib"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipympl"

inherit rpm
