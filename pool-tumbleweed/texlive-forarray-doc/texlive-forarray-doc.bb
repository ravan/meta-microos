SUMMARY = "Documentation for texlive-forarray"
DESCRIPTION = "This package includes the documentation for texlive-forarray"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn78101"

RPM_NAME = "texlive-forarray-doc-2026.226.1.01svn78101-60.2.noarch.rpm"
RPM_HASH = "a892be757c1e0032b87f5195ce935fe600e99b4764a82ce0c939388521a29c20c9f73fef0a681f545878683b998405a588d3a28bbf56746a8a1a347e8b29be49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forarray-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
