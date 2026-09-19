SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python312-nbdime-hg-4.0.2-18.2.noarch.rpm"
RPM_HASH = "d8bde094be9e9c1817cc9055b6db95292498c1e7cbe83380572c0cdc92ae93006a2179334c4d46d1aba43709332afd8356039eaa2c61bec496ef0f25006ff9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python312-jupyter-nbdime-hg \
python312-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
mercurial \
python312-nbdime"

inherit rpm
