SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & LicenseRef-SUSE-Public-Domain"

PV = "0.23"

RPM_NAME = "python313-docutils-0.23-1.1.noarch.rpm"
RPM_HASH = "40f8a97235e46a69b301c4fe09f9375dfdec30af601099e99075eadd254638e51ae9b5cc57f5e2cb0f518bbf1f86574e2aac2a67cda9fe829a78bc0dfc3439f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docutils \
python3-docutils \
python3.13dist-docutils \
python313-docutils \
python3dist-docutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
