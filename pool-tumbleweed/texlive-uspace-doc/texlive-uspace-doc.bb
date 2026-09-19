SUMMARY = "Documentation for texlive-uspace"
DESCRIPTION = "This package includes the documentation for texlive-uspace"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn63123"

RPM_NAME = "texlive-uspace-doc-2026.226.0.0.05svn63123-60.2.noarch.rpm"
RPM_HASH = "399634f637779420b02fb3d000e54c6ebbb7d393f53744873e4ddff4247fa2d3ea760e9b57f72b2dbea7592d53a71316f6743f23a4d7aa8594e51ffaa4647662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspace-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
