SUMMARY = "Documentation for texlive-lua-widow-control"
DESCRIPTION = "This package includes the documentation for texlive-lua-widow-control"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn77682"

RPM_NAME = "texlive-lua-widow-control-doc-2026.226.3.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "12f94e90016953a86a17ccadf85dba4f0d34ff827110c88a4b3624a69c7eff5fa489d717130579b2ae850d401c4f3649bf0a5f4bb768f0ac0fce6a355970947f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-widow-control-doc"

RDEPENDS:${PN} += ""

inherit rpm
