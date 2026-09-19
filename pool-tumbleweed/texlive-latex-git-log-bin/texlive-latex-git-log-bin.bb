SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2026.20260301.svn30983-120.4.aarch64.rpm"
RPM_HASH = "5e8e0a6eff4b57078925a0b5f623e4248d4d00ad42269823b1503001df7759f05dab37fdf510f788e1041c58a37afb33e524c6a90948468b7a7d213a632c53d9"

RPROVIDES:${PN} += "texlive-latex-git-log-bin"

RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
