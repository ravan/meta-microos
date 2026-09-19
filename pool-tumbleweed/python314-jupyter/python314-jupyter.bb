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
  - python314-notebook - Jupyter Notebook \
  - python314-jupyterlab - JupyterLab (added to metapackage v1.1) \
  - python314-ipython - IPython (terminal) \
  - python314-ipykernel - IPython Kernel for Jupyter \
  - python314-jupyter-console - terminal Jupyter client \
  - python314-nbconvert - convert notebooks between formats \
  - python314-ipywidgets - interactive widgets package for IPython \
 \
No longer included as hard dependency, but still supported: \
 \
  - python314-qtconsole - Qt Console (removed in metapackage v1.1)"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python314-jupyter-1.1.1-1.7.noarch.rpm"
RPM_HASH = "8ea54dba6e6fc788e2b4d107c15ac09fab25dfca5837d5e0cfb099f99cfe8e6537877bbdd88637c45cd20c754eb1aadcca48d1be1c27ef7965830d225ddcc465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter \
python314-jupyter \
python3dist-jupyter"

RDEPENDS:${PN} += "python-abi \
python314-ipykernel \
python314-ipywidgets \
python314-jupyter-console \
python314-jupyterlab \
python314-nbconvert \
python314-notebook"

inherit rpm
