SUMMARY = "Documentation for texlive-babel-sorbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-sorbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0jsvn77682"

RPM_NAME = "texlive-babel-sorbian-doc-2026.226.1.0jsvn77682-60.2.noarch.rpm"
RPM_HASH = "5032bbebc392c6cc6d30deb5e2e440d683253d10137be71367880fe2c080e6a6adbbefc818745e87ae359cc24837ff15e01de62b2573d270a99930f8a97fb0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-sorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
