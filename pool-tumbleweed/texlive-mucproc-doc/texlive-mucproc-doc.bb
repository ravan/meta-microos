SUMMARY = "Documentation for texlive-mucproc"
DESCRIPTION = "This package includes the documentation for texlive-mucproc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn43445"

RPM_NAME = "texlive-mucproc-doc-2026.226.1.02svn43445-61.2.noarch.rpm"
RPM_HASH = "769eca846e5429da0ec9487226b382b0bb8e954c36903fed6e35343bc60c166e5988bbce8af27d6e19cf994e0ef322145799b89f00cfad81593d2e1f57a59a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mucproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
