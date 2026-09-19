SUMMARY = "Documentation for gitslave"
DESCRIPTION = "This package provides documentation and help files for gitslave."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-doc-2.0.2-10.8.noarch.rpm"
RPM_HASH = "449fe75cb65efadcab739d03af5f722cbb8e21e8b9cd0f172353e9633a5f0051401be9d2914f65be6adf72875a79854693a51ddb7091cd41bc2802c9e28297eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave-doc"

RDEPENDS:${PN} += ""

inherit rpm
