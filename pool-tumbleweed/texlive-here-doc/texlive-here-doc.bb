SUMMARY = "Documentation for texlive-here"
DESCRIPTION = "This package includes the documentation for texlive-here"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16135"

RPM_NAME = "texlive-here-doc-2026.226.svn16135-60.4.noarch.rpm"
RPM_HASH = "a94ae9d24d1dc1aae1e5972018cfb6cf577282bfaa7f4f1c234df4e84ebfec65bcfbdf82eb13c64c97329e708ac235bd420d0cb88f1c23767b111cf17c975d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-here-doc"

RDEPENDS:${PN} += ""

inherit rpm
