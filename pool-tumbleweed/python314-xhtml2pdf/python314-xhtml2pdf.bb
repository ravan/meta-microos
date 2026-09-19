SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.17"

RPM_NAME = "python314-xhtml2pdf-0.2.17-2.5.noarch.rpm"
RPM_HASH = "f3e4d8ccdda1a6846ab1ec41ecc19ddecf13f3455576b53242f92f29f4acb863ea147060fb7afa42bc75352d26fc898d5b611110eef212eb068ebdb7e0d6b413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xhtml2pdf \
python314-xhtml2pdf \
python3dist-xhtml2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-arabic-reshaper \
python314-html5lib \
python314-pyHanko \
python314-pypdf \
python314-python-bidi \
python314-reportlab \
python314-svglib \
update-alternatives"

inherit rpm
