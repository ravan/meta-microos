SUMMARY = "Documentation for texlive-cuisine"
DESCRIPTION = "This package includes the documentation for texlive-cuisine"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn34453"

RPM_NAME = "texlive-cuisine-doc-2026.226.0.0.7svn34453-61.2.noarch.rpm"
RPM_HASH = "805ac712ea5e37cc407ac85566af2c43d690205970f9cfe6976c9354a03341d318c7250044a8096066cbacf0196384168412157556cfc4f17d7af56890a24354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuisine-doc"

RDEPENDS:${PN} += ""

inherit rpm
