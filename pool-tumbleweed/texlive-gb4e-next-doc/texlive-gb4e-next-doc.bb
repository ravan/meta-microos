SUMMARY = "Documentation for texlive-gb4e-next"
DESCRIPTION = "This package includes the documentation for texlive-gb4e-next"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn72692"

RPM_NAME = "texlive-gb4e-next-doc-2026.226.0.0.5svn72692-60.2.noarch.rpm"
RPM_HASH = "512e37f492c418704f1925f32e89e8df5d7f4537bf3aeb5f0ed5bb6ae20f75e2667f7ec9bd76348df14490ed0cd6b84a5a57ce3c16d91b3fafe1fddc5c62f585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gb4e-next-doc"

RDEPENDS:${PN} += ""

inherit rpm
