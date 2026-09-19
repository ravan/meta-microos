SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & LicenseRef-SUSE-Public-Domain"

PV = "0.23"

RPM_NAME = "python314-docutils-0.23-1.1.noarch.rpm"
RPM_HASH = "84fec3362857783ccff05b04c780196c0d0cadf9d01261ee5930525074cc523fa8d899c1ba6d211c8aabe226a27bd4a544b2d8a9f7539c7d88b460be84789013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docutils \
python314-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
