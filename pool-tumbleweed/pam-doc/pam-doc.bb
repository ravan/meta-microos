SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-doc-1.7.2+git48-1.1.noarch.rpm"
RPM_HASH = "a811c7769ca3ab8ee11143c65148cd3e1dc94855660d11fd02a5862246a768deaa38ee1c0a58218eff12da42fd3c3d16370cbc3ce8c54b0a7b6f70fa5198f3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"

RDEPENDS:${PN} += ""

inherit rpm
