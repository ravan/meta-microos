SUMMARY = "Documentation for texlive-lecturer"
DESCRIPTION = "This package includes the documentation for texlive-lecturer"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23916"

RPM_NAME = "texlive-lecturer-doc-2026.226.svn23916-61.2.noarch.rpm"
RPM_HASH = "c42ac8284d138387a85358d523ca8ea416da031fa9923bb2b3588a1d1afaf9df213b7e057b383c65aaa2e2cd9662afdbe9962c38fa8ae9f5c6ebe636265088b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lecturer-doc"

RDEPENDS:${PN} += ""

inherit rpm
