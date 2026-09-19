SUMMARY = "Documentation for texlive-dvips"
DESCRIPTION = "This package includes the documentation for texlive-dvips"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-dvips-doc-2026.226.svn77830-61.4.noarch.rpm"
RPM_HASH = "100319a246ac9098df49d7e9904d37f1f4f6e7625c460c17b7c4c32cb3b046c56d685c4246af0771be1c897d69978b64c2e6b893e27aeb42e3f2a51474248a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2tfm.1 \
man-dvips.1 \
texlive-dvips-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
