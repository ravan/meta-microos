SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python314-nbsphinx-0.9.8-1.3.noarch.rpm"
RPM_HASH = "609631e77e352d632387258255455d11a99db9b81fa11713afff89092668850b4ee95f02ced5fe172f335e72f6ae91c2d05ec7be856b7308b2db8faacd03006c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbsphinx \
python314-jupyter-nbsphinx \
python314-nbsphinx \
python3dist-nbsphinx"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Sphinx \
python314-docutils \
python314-nbconvert \
python314-nbformat \
python314-traitlets"

inherit rpm
