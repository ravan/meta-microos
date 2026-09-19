SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "9.1.0"

RPM_NAME = "python-Sphinx-doc-html-9.1.0-2.1.noarch.rpm"
RPM_HASH = "12994cb8b5481d92d29eef595762a4cf9dec4e30b43d19e5567e6ea0a396da3c713be9f18d53a8e0b15548b5f2789e649f57e9f13f2c0e318eca8aaf4fccfc9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
