SUMMARY = "Documentation for texlive-lualineno"
DESCRIPTION = "This package includes the documentation for texlive-lualineno"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77766"

RPM_NAME = "texlive-lualineno-doc-2026.226.0.0.1svn77766-59.2.noarch.rpm"
RPM_HASH = "1155a13b9b7fe21be62bd2a0eafa7231d29df55cbd2c46a5508637e71795be7471dad73bab1589ee3965b0de337781c5839a005ed2b0b8f6f1c115e0f90fc324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualineno-doc"

RDEPENDS:${PN} += ""

inherit rpm
