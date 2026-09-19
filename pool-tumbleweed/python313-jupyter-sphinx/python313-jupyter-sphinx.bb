SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.5.3"

RPM_NAME = "python313-jupyter-sphinx-0.5.3-4.3.noarch.rpm"
RPM_HASH = "83ab85645123b91a010530fac7460f218ce5a135a388276f0213e92d15f6d38c8a478684b8ac4351fcb7af07387e761dc680de86b306a49028358592bc6521b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-sphinx \
python3-jupyter-sphinx \
python3.13dist-jupyter-sphinx \
python313-jupyter-sphinx \
python3dist-jupyter-sphinx"

RDEPENDS:${PN} += "python-abi \
python313-IPython \
python313-Sphinx \
python313-ipykernel \
python313-ipywidgets \
python313-nbconvert \
python313-nbformat"

inherit rpm
