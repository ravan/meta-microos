SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.17.1"

RPM_NAME = "python314-nbconvert-7.17.1-2.1.noarch.rpm"
RPM_HASH = "c22192f936b4c12fe0dd310d1fb2f23bce70dba42b4d2e0642fa2a91a08189d25b2f178f4ef06e978786a65f19a0d8b195328fe3e673956da57e571110a1338e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbconvert \
python314-jupyter-nbconvert \
python314-nbconvert \
python3dist-nbconvert"

RDEPENDS:${PN} += "-python314-bleach without python314-bleach = 5.0.0 \
-python314-mistune >= 2.0.3 with python314-mistune < 4 \
-python314-tinycss2 >= 1.1.0 with python314-tinycss2 < 1.6 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
jupyter-nbconvert \
python-abi \
python314-Jinja2 \
python314-MarkupSafe \
python314-Pygments \
python314-beautifulsoup4 \
python314-defusedxml \
python314-jupyter-core \
python314-jupyterlab-pygments \
python314-nbclient \
python314-nbformat \
python314-packaging \
python314-pandocfilters \
python314-traitlets"

inherit rpm
