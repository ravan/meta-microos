SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.27.2.2"

RPM_NAME = "python313-PyMuPDF-1.27.2.2-3.2.aarch64.rpm"
RPM_HASH = "3f9e2c515ec38a0dbb8dcbeae6130da0bffe88cfa49e171d388b325cab8aef974e0fc4fd00f918d5826f13afc7be53eeb82eb1687442248a621571e7b0b18081"

RPROVIDES:${PN} += "bundled-mupdf \
libmupdf.so.27.2 \
libmupdfcpp.so.27.2 \
python3-PyMuPDF \
python3.13dist-pymupdf \
python313-PyMuPDF \
python3dist-pymupdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
