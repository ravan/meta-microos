SUMMARY = "An automated system for building LaTeX documents"
DESCRIPTION = "Rubber is a building system for LaTeX documents. It is based on a routine that \
runs just as many compilations as necessary. The module system provides a \
great flexibility that virtually allows support for any package with no user \
intervention, as well as pre- and post-processing of the document. The \
standard modules currently provide support for bibtex, dvips, dvipdfm, pdftex, \
makeindex. A good number of standard packages are supported, including \
graphics/graphicx (with automatic conversion between various formats and \
Metapost compilation)."
LICENSE = "GPL-2.0-only"

PV = "1.6.7"

RPM_NAME = "rubber-1.6.7-1.7.noarch.rpm"
RPM_HASH = "170d8b3c2b529df2fadf1399ca680aa4c0c069f6e48899a319e74e6e64b049b775585646b69d06d1355c6d850df0db3aeea868922cb0067b5f7dcdd794965002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-latex-rubber \
python3dist-latex-rubber \
rubber"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
info \
python-abi \
texlive-latex"

inherit rpm
