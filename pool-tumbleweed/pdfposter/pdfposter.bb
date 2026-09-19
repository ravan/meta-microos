SUMMARY = "Scale and tile PDF images/pages to print on multiple pages"
DESCRIPTION = "Create a large poster by building it from \
multiple pages and/or printing it on large media. It expects as input a \
PDF file, normally printing on a single page. The output is again a \
PDF file, maybe containing multiple pages together building the \
poster. \
The input page will be scaled to obtain the desired size. \
 \
This is much like 'poster' does for Postscript files, but working \
with PDF. \
 \
For more information please refer to the manpage or visit \
the project homepage https://pdfposter.readthedocs.io/"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "pdfposter-0.9.1-1.2.noarch.rpm"
RPM_HASH = "78976a85981dc69e8774eb8256855be1b29574339b5010c00b16f7257749952b643de2523013e4322620bab37aba431fc326fd74830f28c1a85cdbccbe637f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter \
python3.13dist-pdfposter \
python3dist-pdfposter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-base \
python3-pypdf"

inherit rpm
