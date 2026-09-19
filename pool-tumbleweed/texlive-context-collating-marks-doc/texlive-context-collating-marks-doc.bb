SUMMARY = "Documentation for texlive-context-collating-marks"
DESCRIPTION = "This package includes the documentation for texlive-context-collating-marks"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn68696"

RPM_NAME = "texlive-context-collating-marks-doc-2026.226.svn68696-61.2.noarch.rpm"
RPM_HASH = "55002c7a853f33d80b0973f31931dc6f1cc3427cb4ead7cc766e985e86fff0d4c869096cc523d52c40d33c6ac964b4957e2b508c8dd367b37794f0409f0df7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-collating-marks-doc"

RDEPENDS:${PN} += ""

inherit rpm
