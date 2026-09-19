SUMMARY = "BibTeX-compatible Bibliography Processor in Python"
DESCRIPTION = "Pybtex is a BibTeX-compatible bibliography processor written in Python which \
can produce formatted bibliographies in different, customizable formats. It \
supports both native BibTeX style files and styles written in Python and \
accepts BibTeX, BibTeXML, and a custom YAML-based bibligraphy input format and \
can output LaTeX, HTML, and plain text. \
 \
Furthermore, Pybtex provides an interface for Python applications which need to \
process the above formats."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python314-pybtex-0.24.0-4.5.noarch.rpm"
RPM_HASH = "2df8698b0ec302913bea242ca405247475a2b6f9a4921196f001a243d118c2f61050fa044a496542f2eb8fb684b43d688f8937acf71907a7ade972788dedb627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybtex \
python314-pybtex \
python3dist-pybtex"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-latexcodec \
python314-pyparsing \
update-alternatives"

inherit rpm
