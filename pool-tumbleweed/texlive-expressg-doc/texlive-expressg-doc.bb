SUMMARY = "Documentation for texlive-expressg"
DESCRIPTION = "This package includes the documentation for texlive-expressg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn29349"

RPM_NAME = "texlive-expressg-doc-2026.226.1.5svn29349-59.2.noarch.rpm"
RPM_HASH = "321fbbaaa0ce63320668a5ffa67847d5d8ca1a1efa1d83b1cf34972f57b99fcc703f4a4498a07fdcd12e4a43f0e0a089526e11ce14df0fc66c148bc7ed395868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
