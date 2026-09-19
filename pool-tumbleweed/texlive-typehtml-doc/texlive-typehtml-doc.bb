SUMMARY = "Documentation for texlive-typehtml"
DESCRIPTION = "This package includes the documentation for texlive-typehtml"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17134"

RPM_NAME = "texlive-typehtml-doc-2026.226.svn17134-59.2.noarch.rpm"
RPM_HASH = "35dd14074743c1a00f264b05f1aee6dd0e1a38c63db7d1bd70c899fc5748e4cb150eaeb2cbb5c4f33f0bb9cbe69c17262b823c1e148923919611abe46b8998b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typehtml-doc"

RDEPENDS:${PN} += ""

inherit rpm
