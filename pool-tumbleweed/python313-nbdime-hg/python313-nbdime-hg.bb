SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python313-nbdime-hg-4.0.2-18.2.noarch.rpm"
RPM_HASH = "d92fdd9933eb116cfc1c660a7fdaab895d6743e562feee485606fded0d9ed782a42801b36cb0b3cecb7db7f0f653f2c7c64ae4003a4569297165d71ee01ceff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-jupyter-nbdime-hg \
python313-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
mercurial \
python313-nbdime"

inherit rpm
