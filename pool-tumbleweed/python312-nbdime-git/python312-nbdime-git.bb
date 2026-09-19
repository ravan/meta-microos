SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python312-nbdime-git-4.0.2-18.2.noarch.rpm"
RPM_HASH = "19781ed12eba7d580f334921d770f45a86f0fbdc3e8b8d68a1a8dd5b4c1e3243d1b2ad3772d6b152d0307d939225238370e36f0e9a4825dfa0e848a069a36a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python312-jupyter-nbdime-git \
python312-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
git-core \
python312-nbdime"

inherit rpm
