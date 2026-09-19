SUMMARY = "Documentation for texlive-dlfltxb"
DESCRIPTION = "This package includes the documentation for texlive-dlfltxb"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17337"

RPM_NAME = "texlive-dlfltxb-doc-2026.226.svn17337-59.2.noarch.rpm"
RPM_HASH = "966504c0a9e89acbbd659d376daf07609c6dccf9a9833f9cb23e3124217ac479f2e2c53cb7503490da00410b0adc37467d57514e0b3445086aa621df5dc7074c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dlfltxb-doc"

RDEPENDS:${PN} += ""

inherit rpm
