SUMMARY = "Python module to convert web documents to PDF"
DESCRIPTION = "WeasyPrint is a visual rendering engine for HTML and CSS that can \
export to PDF. It aims to support web standards for printing. \
 \
It is based on various libraries but not on a full rendering engine \
like WebKit or Gecko. The CSS layout engine is written in Python, \
designed for pagination, and meant to be easy to hack on."
LICENSE = "BSD-3-Clause"

PV = "69.0"

RPM_NAME = "python314-weasyprint-69.0-1.1.noarch.rpm"
RPM_HASH = "b409294d375a528ece43e47f77d313c9b8936f9db758835e78f7ef7518745533b8f59333c7dcd953fecb34d5496d59498bda24eb53f0a12afcc40f91e6430288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-weasyprint \
python314-WeasyPrint \
python314-weasyprint \
python3dist-weasyprint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
libgobject-2-0-0 \
pango \
python-abi \
python314-Brotli \
python314-FontTools \
python314-Pillow \
python314-Pyphen \
python314-base \
python314-cffi \
python314-cssselect2 \
python314-pydyf \
python314-tinycss2 \
python314-tinyhtml5 \
python314-zopfli"

inherit rpm
