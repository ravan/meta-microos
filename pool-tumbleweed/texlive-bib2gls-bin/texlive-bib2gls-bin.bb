SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73132"

RPM_NAME = "texlive-bib2gls-bin-2026.20260301.svn73132-120.4.aarch64.rpm"
RPM_HASH = "62b89edbeefcf6b68aebcc7163e1c43a9d0eda5fce4c046c7d068f31251e33e708f1cc075273416b5687a03bbd1ba6f4cf16974fcc350b147ad75c9b0e02a92b"

RPROVIDES:${PN} += "texlive-bib2gls-bin"

RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm
