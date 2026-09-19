SUMMARY = "Documentation for texlive-euler-math"
DESCRIPTION = "This package includes the documentation for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.75svn77952"

RPM_NAME = "texlive-euler-math-doc-2026.226.0.0.75svn77952-59.2.noarch.rpm"
RPM_HASH = "519d6e612ccf7477610302d35a2947aac96fcbb830718c5a4f0d7af95efb016db87900bcba47bd79c08fb11519c10626b574c4c81a8a411261307a71a66ffaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
