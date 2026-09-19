SUMMARY = "Documentation for texlive-parallel"
DESCRIPTION = "This package includes the documentation for texlive-parallel"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-parallel-doc-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "8974ef334e98d8f22a645edc42784095a1b9fb1a8432aeb3b37f7d64b5c3d4113ade85aa0b5cd965f0721922d48f221fd8c5c690e61d5373e81369813bc9831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
