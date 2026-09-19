SUMMARY = "Documentation for texlive-texloganalyser"
DESCRIPTION = "This package includes the documentation for texlive-texloganalyser"
LICENSE = "BSD-3-Clause"

PV = "2026.227.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-doc-2026.227.0.0.11svn54526-62.2.noarch.rpm"
RPM_HASH = "43a9c4b3f156e520a9f0d2e79c4cf103684641640e0571c1fbde9d178ee3a8d81f59b27e9cef13174384cd8a8cb4af9662359ae2228bfb44d29e5995fa39e787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texloganalyser-doc"

RDEPENDS:${PN} += ""

inherit rpm
