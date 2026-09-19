SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python314-jupyter-sphinx-0.5.3-4.3.noarch.rpm"
RPM_HASH = "133fd4685523591b7a054b6e654c35bbae07d003e9a6645b11c8ebcdedf18615fa726c691283b2c35f91ced79796e2d91bcc5e2f974dbd07f6fe4665b4995251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-sphinx \
python314-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python314-IPython \
python314-Sphinx \
python314-ipykernel \
python314-ipywidgets \
python314-nbconvert \
python314-nbformat"

inherit rpm
