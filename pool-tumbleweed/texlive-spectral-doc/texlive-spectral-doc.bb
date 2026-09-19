SUMMARY = "Documentation for texlive-spectral"
DESCRIPTION = "This package includes the documentation for texlive-spectral"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-spectral-doc-2026.226.svn77682-64.2.noarch.rpm"
RPM_HASH = "e060ce7f1e00bb64f33bc7f107782432c79b32757d208f22e29712e47023dae6d0289b514630a4f3cb25ae7032ecbc7dc6da2112e48e048d2edf640af8f5fa5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectral-doc"

RDEPENDS:${PN} += ""

inherit rpm
