SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn65210"

RPM_NAME = "texlive-digestif-bin-2026.20260301.svn65210-120.4.aarch64.rpm"
RPM_HASH = "d0547eea5ba3c6fcaf34a898ef2f564ec39bc309cdd540c902b749aeed4b993c5994dafdd06b21d8791687ba7652dbda8048afce4ed9c791050a345f2b2f67b4"

RPROVIDES:${PN} += "texlive-digestif-bin"

RDEPENDS:${PN} += "texlive-digestif"

inherit rpm
