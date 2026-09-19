SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "69.0"

RPM_NAME = "python313-weasyprint-69.0-1.1.noarch.rpm"
RPM_HASH = "37263c2935f99b8a93a479582c5d4a73038198eaa07dcd2e4150ff0d88771d1d4491aa001083c357f963d7e21669690723e7b60c3f0009657bcda1b842eefc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WeasyPrint \
python3-weasyprint \
python3.13dist-weasyprint \
python313-WeasyPrint \
python313-weasyprint \
python3dist-weasyprint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
libgobject-2-0-0 \
pango \
python-abi \
python313-Brotli \
python313-FontTools \
python313-Pillow \
python313-Pyphen \
python313-base \
python313-cffi \
python313-cssselect2 \
python313-pydyf \
python313-tinycss2 \
python313-tinyhtml5 \
python313-zopfli"

inherit rpm
