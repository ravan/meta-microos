SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-nbdime-hg-4.0.2-18.2.noarch.rpm"
RPM_HASH = "0672f80f8d212fd48c52d95b761e919ce992819571ff153c06ccb177183a682f213888f6c4b5c62a5763ed95373b42a82a9ef648b65588bf6a2efbb5006dbc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-hg \
python3-jupyter-nbdime-hg \
python3-nbdime-hg \
python311-jupyter-nbdime-hg \
python311-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
mercurial \
python311-nbdime"

inherit rpm
