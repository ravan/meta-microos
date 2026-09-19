SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-nbdime-4.0.2-18.2.noarch.rpm"
RPM_HASH = "424bc5c437d8a145722f81536e2dfe771f77da410bd146d461ff0a85d859bb24d96dd1a097f30653136565b7afc0e3658b7866e41befbf95ea1fd8b756c99c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbdime \
python3-nbdime \
python3.11dist-nbdime \
python311-jupyter-nbdime \
python311-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python311-GitPython \
python311-Jinja2 \
python311-Pygments \
python311-colorama \
python311-jupyter-server \
python311-jupyter-server-mathjax \
python311-nbformat \
python311-requests \
python311-tornado"

inherit rpm
