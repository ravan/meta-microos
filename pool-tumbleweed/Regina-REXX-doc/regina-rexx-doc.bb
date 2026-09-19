SUMMARY = "Documentation for the Regina REXX interpreter"
DESCRIPTION = "Documentation for both the Regina REXX interpreter and the REXX Utility \
Functions (regutil)."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.7"

RPM_NAME = "Regina-REXX-doc-3.9.7-1.1.noarch.rpm"
RPM_HASH = "e9bc8000001c5f3016ab88d2650d0550857e7da4c92bfc90e4a39f41ed35ef08bb94032d15b9cbfaa4028d2e8ed3997c7923e845cbae63e34fe74b251c705063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Regina-REXX-doc"

RDEPENDS:${PN} += ""

inherit rpm
