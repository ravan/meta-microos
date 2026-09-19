SUMMARY = "Documentation for texlive-verbatimbox"
DESCRIPTION = "This package includes the documentation for texlive-verbatimbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-verbatimbox-doc-2026.226.3.2svn77682-60.2.noarch.rpm"
RPM_HASH = "6d1fa413c86870941967474a7f8bfd40c7d22e6351aa7ea8e78f4d1699686b8b6ad5d8a58d32f9a2e16413953cd771d03cf6c19a8e09491cb1024d40ea08b994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
