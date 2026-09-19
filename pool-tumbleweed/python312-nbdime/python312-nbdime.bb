SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python312-nbdime-4.0.2-18.2.noarch.rpm"
RPM_HASH = "c988bd0eaa833c83a5c6e240f00c0b7fa80304d434169d5e8a177ce37160feb9b2013f6f11a7fa6cc68fe294e2c21d8a4fdca47e20b4dda39ba93a36d4af1870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-nbdime \
python312-jupyter-nbdime \
python312-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python312-GitPython \
python312-Jinja2 \
python312-Pygments \
python312-colorama \
python312-jupyter-server \
python312-jupyter-server-mathjax \
python312-nbformat \
python312-requests \
python312-tornado"

inherit rpm
