SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2026.20260301.svn53999-120.4.aarch64.rpm"
RPM_HASH = "9fa72a4d396f9737d8112223338412a967021a1e6f27d2dc5e0eda52673b880e54cba8f2b4070d0ff83997af38d73db83f96827ce22ad6f0198886459c3460a2"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin"

RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm
