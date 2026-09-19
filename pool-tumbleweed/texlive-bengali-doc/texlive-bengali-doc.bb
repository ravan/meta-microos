SUMMARY = "Documentation for texlive-bengali"
DESCRIPTION = "This package includes the documentation for texlive-bengali"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-bengali-doc-2026.226.svn55475-61.2.noarch.rpm"
RPM_HASH = "ea9256033381d1a85f36a0e74f1f5e2b323da0ff86602a6c31a10354e8c590e2c565d52b699a349c2d9415fea85acf86b231d53d19e9746a34fd735f585fcc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bengali-doc"

RDEPENDS:${PN} += ""

inherit rpm
