SUMMARY = "Documentation for texlive-ltx-talk"
DESCRIPTION = "This package includes the documentation for texlive-ltx-talk"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.6svn77950"

RPM_NAME = "texlive-ltx-talk-doc-2026.226.0.0.4.6svn77950-59.2.noarch.rpm"
RPM_HASH = "4c45df18776ce2521564d9fbae43aec81776aff9281995437f3c62b681f7ce9101127c1ce8f60df6a6f00d5f0fd72caaa3805059bb075dea8a1e744933fb2771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltx-talk-doc"

RDEPENDS:${PN} += ""

inherit rpm
