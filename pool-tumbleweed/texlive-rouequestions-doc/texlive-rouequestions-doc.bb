SUMMARY = "Documentation for texlive-rouequestions"
DESCRIPTION = "This package includes the documentation for texlive-rouequestions"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn67670"

RPM_NAME = "texlive-rouequestions-doc-2026.226.0.0.0.3svn67670-60.2.noarch.rpm"
RPM_HASH = "127b32e2767143125cde1eed95d501974e80f76c34740078261a6522c3ab6d899b8dab0370da8d668474fe0b7642b6d523121c953003b87d5f6a30b32aa6e1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-rouequestions-doc-fr \
texlive-rouequestions-doc"

RDEPENDS:${PN} += ""

inherit rpm
