SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-nbdime-git-4.0.2-18.2.noarch.rpm"
RPM_HASH = "9c9ebad551e5bc009f01ba212a81d2a7b05645deb60b742f0b8e20255e9746d82d4042f6e55f3c83f6cf634e5a65d12e54319763ce4cdbfde229adef5ea66e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-git \
python3-jupyter-nbdime-git \
python3-nbdime-git \
python311-jupyter-nbdime-git \
python311-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
git-core \
python311-nbdime"

inherit rpm
