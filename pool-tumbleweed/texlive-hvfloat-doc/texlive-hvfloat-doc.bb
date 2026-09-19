SUMMARY = "Documentation for texlive-hvfloat"
DESCRIPTION = "This package includes the documentation for texlive-hvfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.56svn77682"

RPM_NAME = "texlive-hvfloat-doc-2026.226.2.56svn77682-60.2.noarch.rpm"
RPM_HASH = "ba837bfa9207fff02ea724836052ee16144c26c5bf2a378326f9f7d54dea75aaa622a7f96c62700bb30ddd67c3eedfdca76550813456431251b4249ec3711358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvfloat-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
