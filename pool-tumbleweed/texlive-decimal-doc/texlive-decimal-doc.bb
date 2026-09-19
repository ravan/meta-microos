SUMMARY = "Documentation for texlive-decimal"
DESCRIPTION = "This package includes the documentation for texlive-decimal"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23374"

RPM_NAME = "texlive-decimal-doc-2026.226.svn23374-59.2.noarch.rpm"
RPM_HASH = "7ddec57670cfef39fef04fa6de677e4b232757742d771c4e96cfa94e50ccd78c2293750940944ea82d75f8f721879c5ac24cdc900699b23efe1d5392f4c7b51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decimal-doc"

RDEPENDS:${PN} += ""

inherit rpm
