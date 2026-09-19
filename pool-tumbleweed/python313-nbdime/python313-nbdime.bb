SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python313-nbdime-4.0.2-18.2.noarch.rpm"
RPM_HASH = "449df7fdddcca8e3ac5847f88d89962be95fd917b508e0013c3696da852f62b1038df0c9f01c38f8fb3ac23a0745e76d7a60d2c3d5641f1425c082e80bf2644b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-nbdime \
python313-jupyter-nbdime \
python313-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python313-GitPython \
python313-Jinja2 \
python313-Pygments \
python313-colorama \
python313-jupyter-server \
python313-jupyter-server-mathjax \
python313-nbformat \
python313-requests \
python313-tornado"

inherit rpm
