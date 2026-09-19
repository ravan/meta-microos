SUMMARY = "Documentation for texlive-pl"
DESCRIPTION = "This package includes the documentation for texlive-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.09asvn58661"

RPM_NAME = "texlive-pl-doc-2026.226.1.09asvn58661-58.2.noarch.rpm"
RPM_HASH = "f5a2043a8524b740d33a3e0b9cb04984d582e7245c1575d7633f2fce94d70e37f0651c2726846b61af2a44aa9102c4c6faf485067abebf17ad5349883fe548c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
