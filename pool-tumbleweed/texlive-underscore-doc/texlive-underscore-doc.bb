SUMMARY = "Documentation for texlive-underscore"
DESCRIPTION = "This package includes the documentation for texlive-underscore"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-underscore-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "5c4f7f9d227a89c4c31f8fb507ce846d0cad0f088d3bc1f57af2e7e56ce7f4b1f028117dac8e22c40458f47cf63376361d72587d4ad7272b1c5a837fd50b0041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underscore-doc"

RDEPENDS:${PN} += ""

inherit rpm
