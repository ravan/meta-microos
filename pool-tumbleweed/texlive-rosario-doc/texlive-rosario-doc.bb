SUMMARY = "Documentation for texlive-rosario"
DESCRIPTION = "This package includes the documentation for texlive-rosario"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn51688"

RPM_NAME = "texlive-rosario-doc-2026.226.2.1svn51688-60.2.noarch.rpm"
RPM_HASH = "7e208d80ff14122112e8dd14aadaa4000b9b6672dc713773537a923f84bdd1ea6f619723a2d53197c4e41e8b2e8d9a7c146ea81eb53341fcac3d1ecf653f467b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rosario-doc"

RDEPENDS:${PN} += ""

inherit rpm
