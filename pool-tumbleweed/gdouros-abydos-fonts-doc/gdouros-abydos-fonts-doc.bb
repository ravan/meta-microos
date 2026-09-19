SUMMARY = "Documentation for gdouros-abydos-fonts"
DESCRIPTION = "Contains pdf documentation for gdouros-abydos-fonts."
LICENSE = "SUSE-Permissive"

PV = "1.96"

RPM_NAME = "gdouros-abydos-fonts-doc-1.96-2.15.noarch.rpm"
RPM_HASH = "985b5365a3da679baab8ac2ca475dfeca0c5ae39848f341c767d59ade5382113d3181bb3ff59a5b34f24ddd3e6fbaea535548120332d6d88a5fa720a5af09ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-abydos-fonts-doc"

RDEPENDS:${PN} += "gdouros-abydos-fonts"

inherit rpm
