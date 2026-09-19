SUMMARY = "Documentation for texlive-authordate"
DESCRIPTION = "This package includes the documentation for texlive-authordate"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-authordate-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "83ef359e8a7c7fd6e1a561bcc5a50f47f25da5f0ac8b79f65d06bd734a7b656f2e2605b57a620f4a20002fc1d9941d7a27589ab1eab5dfa031617aaa2ca74322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authordate-doc"

RDEPENDS:${PN} += ""

inherit rpm
