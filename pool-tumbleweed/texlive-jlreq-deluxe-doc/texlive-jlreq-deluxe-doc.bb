SUMMARY = "Documentation for texlive-jlreq-deluxe"
DESCRIPTION = "This package includes the documentation for texlive-jlreq-deluxe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76924"

RPM_NAME = "texlive-jlreq-deluxe-doc-2026.226.0.0.5.0svn76924-63.2.noarch.rpm"
RPM_HASH = "b0d54c4901000be552add68f59e85540e4d2dfd26a15c132227800cf27d9e5da9262f08e2a87b33d27ede202c420480356b7929832a9bf16f5aa108a650afb13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jlreq-deluxe-doc-ja \
texlive-jlreq-deluxe-doc"

RDEPENDS:${PN} += ""

inherit rpm
