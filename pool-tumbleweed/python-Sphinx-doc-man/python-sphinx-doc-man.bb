SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "9.1.0"

RPM_NAME = "python-Sphinx-doc-man-9.1.0-2.1.noarch.rpm"
RPM_HASH = "e607057a30f9badaea728ca9e92853e1fdeafc4b750e6851333ea1e75f2f8a5dddaa8781fbd3ebad38f47ef934ed71925b6c75bce851f0137f9bd999ccda686b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"

RDEPENDS:${PN} += "alts \
python3-Sphinx"

inherit rpm
