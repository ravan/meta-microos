SUMMARY = "Converting Djvu Files to PDF Files"
DESCRIPTION = "A small tool to convert Djvu files to PDF files. Works on Linux, BSD and MacOS."
LICENSE = "GPL-2.0+ | LGPL-2.0+"

PV = "0.9.2"

RPM_NAME = "djvu2pdf-0.9.2-9.24.noarch.rpm"
RPM_HASH = "9a29205b4b53c67a0836c1a2e1e3348ae0838f7f6c16c92be18457f438f7109305657a17b97f8bca79b1dbcf1e72e2d7694722621a3e8d722b003aed1b0a8731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvu2pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
djvulibre \
ghostscript-library"

inherit rpm
