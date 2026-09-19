SUMMARY = "Documentation for texlive-matlab-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-matlab-prettifier"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-doc-2026.226.0.0.3svn34323-59.2.noarch.rpm"
RPM_HASH = "b9e7f66a4939683fcb686138224abe2847125fc8aa313f14c59c1bac98b2a790e427841844fb6999c43eebe39ac84038177e2b94005aa56157039c6a1be47e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matlab-prettifier-doc"

RDEPENDS:${PN} += ""

inherit rpm
