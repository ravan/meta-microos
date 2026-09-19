SUMMARY = "Documentation for texlive-esint-type1"
DESCRIPTION = "This package includes the documentation for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-esint-type1-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "bbff285abc4479e83b14f7ebdd3000244cd87ca5a07f8b9f109067b5765b5d82709c0020fb73d06fab56c02926a5118f5571caa225adbb15b2d7c7ec7c294601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
