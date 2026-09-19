SUMMARY = "Documentation for texlive-inlinebib"
DESCRIPTION = "This package includes the documentation for texlive-inlinebib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22018"

RPM_NAME = "texlive-inlinebib-doc-2026.226.svn22018-60.2.noarch.rpm"
RPM_HASH = "84c1d157d73a6603fcaab52eda4d33908ce7d03e16fb3ed95aac605aea576a9c6d211daa0aadea1f6c1d0d2f295550c56e06b3db10ef21bd88956cf6dabad898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
