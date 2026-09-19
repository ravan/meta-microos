SUMMARY = "Common directories shared by JupyterLab packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on JupyterLab. \
 \
It also provides macros for building packages that depend on \
JupyterLab."
LICENSE = "BSD-3-Clause"

PV = "20241127"

RPM_NAME = "jupyter-jupyterlab-filesystem-20241127-1.8.noarch.rpm"
RPM_HASH = "662192f7def2f6fbf4795cb67ba9f44d6ab2066d97252571fcbca89ffb95f5ddd85c74f7a876e4c714596fb76084fcf388fff9b45a7db77e1dd7aa7423306c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-filesystem \
jupyter-jupyterlab-macros-devel \
python313-jupyterlab-filesystem \
python313-jupyterlab-macros-devel \
python314-jupyterlab-filesystem \
python314-jupyterlab-macros-devel \
rpm-macro--jupyter-lab-dir \
rpm-macro--jupyter-labextensions-dir \
rpm-macro--jupyter-labextensions-dir3"

RDEPENDS:${PN} += "jupyter-jupyter-core-filesystem"

inherit rpm
