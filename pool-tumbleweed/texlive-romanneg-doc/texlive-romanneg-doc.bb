SUMMARY = "Documentation for texlive-romanneg"
DESCRIPTION = "This package includes the documentation for texlive-romanneg"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20087"

RPM_NAME = "texlive-romanneg-doc-2026.226.svn20087-60.2.noarch.rpm"
RPM_HASH = "6b878ade98cce7d0de761349d8f180ca834dce6045902d5ed2cdc6a5874207e60af267fcb707e6850efc907879e2d81c7de909eb9b0d43a5648da831ace0b19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanneg-doc"

RDEPENDS:${PN} += ""

inherit rpm
