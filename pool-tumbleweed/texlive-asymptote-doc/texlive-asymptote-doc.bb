SUMMARY = "Documentation for texlive-asymptote"
DESCRIPTION = "This package includes the documentation for texlive-asymptote"
LICENSE = "LGPL-3.0-or-later"

PV = "2026.226.3.09svn78154"

RPM_NAME = "texlive-asymptote-doc-2026.226.3.09svn78154-60.2.noarch.rpm"
RPM_HASH = "0e0285b6f701c2018befc130927293d95ee5daec4d3d56d4a9e9e0e0180135d4a59f56b81e5016a2e20687577dfee4ab7d12a281ef68889df81183bbdd729540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-asy.1 \
man-xasy.1 \
texlive-asymptote-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
