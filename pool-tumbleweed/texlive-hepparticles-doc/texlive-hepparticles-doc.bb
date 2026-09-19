SUMMARY = "Documentation for texlive-hepparticles"
DESCRIPTION = "This package includes the documentation for texlive-hepparticles"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn35723"

RPM_NAME = "texlive-hepparticles-doc-2026.226.2.0svn35723-60.4.noarch.rpm"
RPM_HASH = "d0c9fd2f418bc42e5737ad229a761df0faffafdd272e5dac09358f0cf219ecc78f4d84a7fbfdfe35060d86559fa54bfa45eb203b71c1998ca3aa9cab030684ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepparticles-doc"

RDEPENDS:${PN} += ""

inherit rpm
