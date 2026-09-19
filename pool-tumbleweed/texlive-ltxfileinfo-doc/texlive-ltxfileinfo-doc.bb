SUMMARY = "Documentation for texlive-ltxfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-ltxfileinfo"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-doc-2026.226.2.04svn38663-59.2.noarch.rpm"
RPM_HASH = "3ef6a2c09bace6f67fbd2bd0ec7b40bfa6dd95dd86930b1410a6b8b10606583075081127b0665505e9219a57a858ac97dc4aaac5e511f00ba182ac59ba9a47c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
