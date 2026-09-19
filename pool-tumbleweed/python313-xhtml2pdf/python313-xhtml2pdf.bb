SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.17"

RPM_NAME = "python313-xhtml2pdf-0.2.17-2.5.noarch.rpm"
RPM_HASH = "bde85d75e5e559153fd1dd5772584bc236b7b1f19a3191fb375027be308419b0a7d677ae1e8f45d02e90caf934e93f1668f1e746d7b09a447a00d22222f51c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xhtml2pdf \
python3.13dist-xhtml2pdf \
python313-xhtml2pdf \
python3dist-xhtml2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-arabic-reshaper \
python313-html5lib \
python313-pyHanko \
python313-pypdf \
python313-python-bidi \
python313-reportlab \
python313-svglib \
update-alternatives"

inherit rpm
