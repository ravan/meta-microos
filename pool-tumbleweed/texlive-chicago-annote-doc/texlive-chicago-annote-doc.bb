SUMMARY = "Documentation for texlive-chicago-annote"
DESCRIPTION = "This package includes the documentation for texlive-chicago-annote"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-chicago-annote-doc-2026.226.svn76790-60.2.noarch.rpm"
RPM_HASH = "b5723e6735b6def51c7ea73ffc93e18bf2c1ac32f6242db2f17e18b967c77d809b78f0f15726b60d6d1423ddb2972a48e22615414fcb1d956effdece380c8759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote-doc"

RDEPENDS:${PN} += ""

inherit rpm
