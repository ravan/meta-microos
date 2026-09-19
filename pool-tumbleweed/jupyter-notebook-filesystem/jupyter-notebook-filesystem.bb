SUMMARY = "Common directories shared by Jupyter notebook packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on the Jupyter notebook. \
 \
It also provides macros for building packages that depend on \
the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "20241127"

RPM_NAME = "jupyter-notebook-filesystem-20241127-1.8.noarch.rpm"
RPM_HASH = "c70819a5e848956cf995c3260d5a255b256d3e9c81ca4ceb45e8ecea81f067c8d1064cbfc0cfed7a34ba80bc0f8d5190078276d2aa1f7533ef18830ed5f58845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-filesystem \
jupyter-notebook-macros-devel \
python313-notebook-filesystem \
python313-notebook-macros-devel \
python314-notebook-filesystem \
python314-notebook-macros-devel \
rpm-macro--jupyter-nb-auth-confdir \
rpm-macro--jupyter-nb-base-confdir \
rpm-macro--jupyter-nb-bidi-confdir \
rpm-macro--jupyter-nb-confdir \
rpm-macro--jupyter-nb-custom-confdir \
rpm-macro--jupyter-nb-edit-confdir \
rpm-macro--jupyter-nb-notebook-confdir \
rpm-macro--jupyter-nb-services-confdir \
rpm-macro--jupyter-nb-style-confdir \
rpm-macro--jupyter-nb-terminal-confdir \
rpm-macro--jupyter-nb-tree-confdir \
rpm-macro--jupyter-nbextension-confdir \
rpm-macro--jupyter-nbextension-dir \
rpm-macro--jupyter-server-confdir \
rpm-macro--jupyter-servextension-confdir \
rpm-macro-jupyter-nbextension-disable \
rpm-macro-jupyter-nbextension-enable \
rpm-macro-jupyter-nbextension-install \
rpm-macro-jupyter-serverextension-disable \
rpm-macro-jupyter-serverextension-enable"

RDEPENDS:${PN} += "jupyter-jupyter-core-filesystem \
python-rpm-macros"

inherit rpm
