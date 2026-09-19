SUMMARY = "Documentation for texlive-overlays"
DESCRIPTION = "This package includes the documentation for texlive-overlays"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn57866"

RPM_NAME = "texlive-overlays-doc-2026.226.2.12svn57866-58.2.noarch.rpm"
RPM_HASH = "7ff5b4e964d9cd78c64181890747e258c773eea328b01372f7d034d8d6d12b64ff5afa9e730068b94e0d556830eefff285c92a1489b1f5748787e5b1e189f421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlays-doc"

RDEPENDS:${PN} += ""

inherit rpm
