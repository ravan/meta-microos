SUMMARY = "Macros for building Jupyter RPM packages"
DESCRIPTION = "This package provides macros for building packages that interface with \
Jupyter, Notebook or Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "20241127"

RPM_NAME = "jupyter-rpm-macros-20241127-1.8.noarch.rpm"
RPM_HASH = "76c8a106bd54f689dceb114fe9fb252306504473390defa40c063845bd6f5541d97d1c3d73c5eff6b355e67532f888d4df55b07b728b0883b13f783c85def4c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-rpm-macros"

RDEPENDS:${PN} += "jupyter-jupyter-core-filesystem \
jupyter-jupyterlab-filesystem \
jupyter-notebook-filesystem"

inherit rpm
