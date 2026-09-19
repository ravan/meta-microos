SUMMARY = "Documentation for texlive-wallcalendar"
DESCRIPTION = "This package includes the documentation for texlive-wallcalendar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn75649"

RPM_NAME = "texlive-wallcalendar-doc-2026.226.1.3.1svn75649-60.2.noarch.rpm"
RPM_HASH = "1f44a7c1399e514dd98a291433cf61f69e7c91b1b4924b2519d6f889b8b9885bf234e1c20dae4737d2a5296015490ed071c0957fb36220da6142b95114ab8255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallcalendar-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
