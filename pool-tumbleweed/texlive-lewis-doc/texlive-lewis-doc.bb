SUMMARY = "Documentation for texlive-lewis"
DESCRIPTION = "This package includes the documentation for texlive-lewis"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-lewis-doc-2026.226.0.0.1svn15878-61.2.noarch.rpm"
RPM_HASH = "73dade9bcf0eaf48a32c365855f8f4f6e4d10c74b80edb43f8b94da69b2796919e38dcbb6440ac9c6072c9a2fdfb5b5e1bab77dc013d54bfac939e7652ae165a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lewis-doc"

RDEPENDS:${PN} += ""

inherit rpm
