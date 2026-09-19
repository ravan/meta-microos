SUMMARY = "Common directories shared by Jupyter packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on jupyter_core. \
 \
It also provides macros for building packages that depend on \
jupyter_core."
LICENSE = "BSD-3-Clause"

PV = "20241127"

RPM_NAME = "jupyter-jupyter_core-filesystem-20241127-1.8.noarch.rpm"
RPM_HASH = "1dc592c3477d8646f809247bedebe92662ddc331bd3b3ead8ae35c7e916bd210c15fedc8b5a05c56e30e873bb217ca76a5f478f6c9226a1757ae29be412936f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-core-filesystem \
jupyter-jupyter-core-macros-devel \
python313-jupyter-core-filesystem \
python313-jupyter-core-macros-devel \
python314-jupyter-core-filesystem \
python314-jupyter-core-macros-devel \
rpm-macro--jupyter-confdir \
rpm-macro--jupyter-config \
rpm-macro--jupyter-distconfig \
rpm-macro--jupyter-kernel-dir \
rpm-macro--jupyter-prefix \
rpm-macro-jupyter-move-config"

RDEPENDS:${PN} += ""

inherit rpm
