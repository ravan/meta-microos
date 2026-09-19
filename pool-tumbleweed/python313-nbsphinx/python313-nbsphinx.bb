SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python313-nbsphinx-0.9.8-1.3.noarch.rpm"
RPM_HASH = "0ce824454db98f13a07afc4cf115f4489f56b18a1e19f5a17bd8bfb0eea6f85358c258a3e416f227a78d253df954f748830675ab24b9ae57be4040f46c8d4c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsphinx \
python3-jupyter-nbsphinx \
python3-nbsphinx \
python3.13dist-nbsphinx \
python313-jupyter-nbsphinx \
python313-nbsphinx \
python3dist-nbsphinx"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Sphinx \
python313-docutils \
python313-nbconvert \
python313-nbformat \
python313-traitlets"

inherit rpm
