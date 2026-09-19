SUMMARY = "Documentation for texlive-latexbangla"
DESCRIPTION = "This package includes the documentation for texlive-latexbangla"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-doc-2026.226.0.0.2svn55475-61.2.noarch.rpm"
RPM_HASH = "9bb64374d2f21caccc9c671a3d3ef645f0cf4222181741acbfec74aa3ccc880c5dc089adb41c6fbc1d7a85d42efeeb3257e46fe145bc89a100a5582296b6b3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbangla-doc"

RDEPENDS:${PN} += ""

inherit rpm
