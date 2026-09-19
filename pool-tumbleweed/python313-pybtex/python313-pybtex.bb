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

RPM_NAME = "python313-pybtex-0.24.0-4.5.noarch.rpm"
RPM_HASH = "bb8473d2ed000fa160fe683f1a60420dda3c60cb146748b30cbf89fa6f34315886ca8d341bb7643a57eee49d2d2039af69744d2ca4067b36c7a6e1b3dfb89a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybtex \
python3.13dist-pybtex \
python313-pybtex \
python3dist-pybtex"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-latexcodec \
python313-pyparsing \
update-alternatives"

inherit rpm
