SUMMARY = "Documentation for texlive-tikz-decofonts"
DESCRIPTION = "This package includes the documentation for texlive-tikz-decofonts"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1.7svn77388"

RPM_NAME = "texlive-tikz-decofonts-doc-2026.227.0.0.1.7svn77388-62.2.noarch.rpm"
RPM_HASH = "f757c8957494c399babe6240f7ea66782a2f9bf424e9342a21c3f400b1e9b3ecec336bca6f097bfcdc5ef529642f4af63ebcfe4981ef990c7b47d05fc21e7844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-decofonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
