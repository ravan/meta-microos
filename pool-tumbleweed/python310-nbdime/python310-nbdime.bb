SUMMARY = "Tools for diffing and merging Jupyter Notebooks"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python310-nbdime-4.0.2-17.1.noarch.rpm"
RPM_HASH = "d6c05ad3457add514aa575c819823811eedb1e776e9c09f5f72828c511fc06d23c0a2aeff7cedcf81dd76761b563d656ea48b199e5dbcc4763d77adb58c7965d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbdime \
python310-jupyter-nbdime \
python310-nbdime \
python3dist-nbdime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-nbdime \
python-abi \
python310-GitPython \
python310-Jinja2 \
python310-Pygments \
python310-colorama \
python310-jupyter-server \
python310-jupyter-server-mathjax \
python310-nbformat \
python310-requests \
python310-tornado"

inherit rpm
