SUMMARY = "Documentation for texlive-luarandom"
DESCRIPTION = "This package includes the documentation for texlive-luarandom"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn78101"

RPM_NAME = "texlive-luarandom-doc-2026.226.0.0.02svn78101-59.2.noarch.rpm"
RPM_HASH = "591189af69e4ec8c88315d0fdef56158f1a53a97474664e5bebbb1e995088796ca51f4ef59552e2f2324837a184f90dd9718f743cc83c04d5910c0ff54a4fa6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luarandom-doc"

RDEPENDS:${PN} += ""

inherit rpm
