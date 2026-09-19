SUMMARY = "Documentation for texlive-tex-ini-files"
DESCRIPTION = "This package includes the documentation for texlive-tex-ini-files"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn73863"

RPM_NAME = "texlive-tex-ini-files-doc-2026.227.svn73863-62.2.noarch.rpm"
RPM_HASH = "04e3b30b6742d1b85523035420dae2a0c4cfa48d053800ad7c1567885a8da343ea68b6cdb3ba9bce364ed7c0589386bd72b6a8a59db7dff65d938f43882849db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ini-files-doc"

RDEPENDS:${PN} += ""

inherit rpm
