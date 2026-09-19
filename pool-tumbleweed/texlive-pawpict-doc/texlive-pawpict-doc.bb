SUMMARY = "Documentation for texlive-pawpict"
DESCRIPTION = "This package includes the documentation for texlive-pawpict"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn21629"

RPM_NAME = "texlive-pawpict-doc-2026.226.1.0svn21629-58.2.noarch.rpm"
RPM_HASH = "0ddfaf556cb2f1d92c7d23750e66eed95e94ad51ee4c71a92f0d61db5adb05b9b4bf643c8cfb5cb84b3c40a1d31b4b2da4caef8b59791722a698baf0af351b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pawpict-doc"

RDEPENDS:${PN} += ""

inherit rpm
