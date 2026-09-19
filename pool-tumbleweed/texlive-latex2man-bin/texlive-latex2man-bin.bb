SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-latex2man-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "f3b8a1970490cf2a38a2de7ee0659f592864c349a79def0ee2ee83400762fdc636cc9aac6af5e1357503e6b5d0317af57f95eb5b101cb90388be86eb8bffa417"

RPROVIDES:${PN} += "texlive-latex2man-bin"

RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
