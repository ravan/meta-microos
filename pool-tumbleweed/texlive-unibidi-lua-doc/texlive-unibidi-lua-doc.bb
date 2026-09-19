SUMMARY = "Documentation for texlive-unibidi-lua"
DESCRIPTION = "This package includes the documentation for texlive-unibidi-lua"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn77352"

RPM_NAME = "texlive-unibidi-lua-doc-2026.226.0.0.3svn77352-60.2.noarch.rpm"
RPM_HASH = "769f648f7d9b60f1d17e1b09d8e13045ce27130617978579af838bb187cb39d555e2853fed246277cd5df8c1aa03f9df7c0190f7f14f7640b7afb4e588fdf684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unibidi-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
