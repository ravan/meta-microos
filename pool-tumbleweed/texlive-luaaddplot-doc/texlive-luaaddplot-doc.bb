SUMMARY = "Documentation for texlive-luaaddplot"
DESCRIPTION = "This package includes the documentation for texlive-luaaddplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn72350"

RPM_NAME = "texlive-luaaddplot-doc-2026.226.1.0asvn72350-59.2.noarch.rpm"
RPM_HASH = "f31d58ec3d45c17c2eada187d55bd9e3e49af6d400e5fffe59b4f654fbf2b060a83fe20b16bfeca2357f019a5d885186591f1afd8cc10b180abf20f58dce2898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaaddplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
