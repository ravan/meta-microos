SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.17.1"

RPM_NAME = "python313-nbconvert-7.17.1-2.1.noarch.rpm"
RPM_HASH = "a14be70201f8e5913b0519fdf70832ee391910b668871cd935ba5d81f268221eb35d5f7c24a136bebabfb531f149e9d4577fb99d23cd243f9f89e43f0ec533e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbconvert \
python3-nbconvert \
python3.13dist-nbconvert \
python313-jupyter-nbconvert \
python313-nbconvert \
python3dist-nbconvert"

RDEPENDS:${PN} += "-python313-bleach without python313-bleach = 5.0.0 \
-python313-mistune >= 2.0.3 with python313-mistune < 4 \
-python313-tinycss2 >= 1.1.0 with python313-tinycss2 < 1.6 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
jupyter-nbconvert \
python-abi \
python313-Jinja2 \
python313-MarkupSafe \
python313-Pygments \
python313-beautifulsoup4 \
python313-defusedxml \
python313-jupyter-core \
python313-jupyterlab-pygments \
python313-nbclient \
python313-nbformat \
python313-packaging \
python313-pandocfilters \
python313-traitlets"

inherit rpm
