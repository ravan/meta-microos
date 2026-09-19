SUMMARY = "Documentation for texlive-fontname"
DESCRIPTION = "This package includes the documentation for texlive-fontname"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75544"

RPM_NAME = "texlive-fontname-doc-2026.226.svn75544-60.2.noarch.rpm"
RPM_HASH = "54ff79c3af778d46d6bd269172114082a36f893b1348513f89520c0abcfa660cc261f9d0e25ddd569bbd38f1496fef9b5d6488d6b52fefbfc42a7057b52ade05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontname-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
