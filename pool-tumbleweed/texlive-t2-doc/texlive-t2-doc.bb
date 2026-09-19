SUMMARY = "Documentation for texlive-t2"
DESCRIPTION = "This package includes the documentation for texlive-t2"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn47870"

RPM_NAME = "texlive-t2-doc-2026.226.svn47870-64.2.noarch.rpm"
RPM_HASH = "cda1a5e89bc66ef7760894627f1827d16c87934e3d9c16caff7999a6f62bed0f5fc37961c7731524d00c7f79e49e9bcc2afb098ef4c034a64c1261df1b93abde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t2-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
