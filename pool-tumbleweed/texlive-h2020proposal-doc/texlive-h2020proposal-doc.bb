SUMMARY = "Documentation for texlive-h2020proposal"
DESCRIPTION = "This package includes the documentation for texlive-h2020proposal"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-doc-2026.226.1.0svn38428-60.4.noarch.rpm"
RPM_HASH = "d270d710d7626bb906ff885418212e7e686562d1028054d7f4004d4547d12674f8918b754c531a67d403f9e0d6ee3e6bd770a84227de3940a484c7a8516a4f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-h2020proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
