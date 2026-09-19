SUMMARY = "Metapackage to install all the Jupyter components in one go"
DESCRIPTION = "Jupyter is an environment for interactive computing in multiple languages. \
It includes a console, a browser-based notebook format, and support for \
dozens of languages through the use of language-specific kernels. \
 \
This is an empty metapackage for user convenience, only expressing \
dependencies on multiple Jupyter packages. jupyter should not be used \
as a dependency for any packages. \
 \
For more efficient installation of what you need, all Jupyter components \
installed by pip install jupyter can be installed separately. For example: \
  - python313-notebook - Jupyter Notebook \
  - python313-jupyterlab - JupyterLab (added to metapackage v1.1) \
  - python313-ipython - IPython (terminal) \
  - python313-ipykernel - IPython Kernel for Jupyter \
  - python313-jupyter-console - terminal Jupyter client \
  - python313-nbconvert - convert notebooks between formats \
  - python313-ipywidgets - interactive widgets package for IPython \
 \
No longer included as hard dependency, but still supported: \
 \
  - python313-qtconsole - Qt Console (removed in metapackage v1.1)"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python313-jupyter-1.1.1-1.7.noarch.rpm"
RPM_HASH = "f448a11dbbce08705775c8a6ebd1c7e103262b306cab6f45ac45cfa89154c6ef0cb72a9e2c4c3928e8e5b827e64a35d92063f9e879df475d4df385a22a1d3830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter \
python3-jupyter \
python3.13dist-jupyter \
python313-jupyter \
python3dist-jupyter"

RDEPENDS:${PN} += "python-abi \
python313-ipykernel \
python313-ipywidgets \
python313-jupyter-console \
python313-jupyterlab \
python313-nbconvert \
python313-notebook"

inherit rpm
