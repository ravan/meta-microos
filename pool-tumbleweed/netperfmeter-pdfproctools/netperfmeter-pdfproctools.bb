SUMMARY = "PDF Processing Tools"
DESCRIPTION = "SetPDFMetadata updates the metadata of a PDF file. In particular, \
it can be used to add outlines (bookmarks) to a document. \
Furthermore, it can set the document properties (e.g. author, \
title, keywords, creator, producer).  PDFEmbedFonts embeds all \
referenced fonts into a PDF file. Optionally, it can also linearize \
the PDF file for online publication ('fast web view', 'optimized'). \
 \
This package contains tools for PDF file processing."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.11"

RPM_NAME = "netperfmeter-pdfproctools-2.0.11-1.1.noarch.rpm"
RPM_HASH = "2862823e9b0f2eab4d8d61e0582894c0b715f25ee882b59d8feeb0588a25be6898338b1c1fcb559b2cf86b0f8bd10a95322d44c6781d8ef88ff32c28a355af0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-pdfproctools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ghostscript \
mupdf \
perl \
perl-PDF-API2 \
qpdf"

inherit rpm
