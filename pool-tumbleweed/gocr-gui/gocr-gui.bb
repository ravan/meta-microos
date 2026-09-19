SUMMARY = "Optical Character Recognition Program - Basic Graphical Interface"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes. \
 \
This package contains a basic graphical interface for GOCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-gui-0.52-3.13.noarch.rpm"
RPM_HASH = "b28d05d6c4fcc1eb8c6d4ec64b6500e5c1aa6c0516697086f9f39943d3a71b7e8fe70865cb2309249f0c1bfd1575d34a025c9f27814d8ae920d90033430709cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gocr-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
gocr \
tk"

inherit rpm
