SUMMARY = "Documentation for texlive-gitinfo2"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo2"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn77682"

RPM_NAME = "texlive-gitinfo2-doc-2026.226.2.0.7svn77682-60.4.noarch.rpm"
RPM_HASH = "283b5ee38c241cc5ce5be02cd3de09b3a0d7c15d652917c242e70f22d96498f0a668b7b5dc2c3f32d422d2bb7b923aa36d29a541af8bc0220cb2f732a1ac8fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo2-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
