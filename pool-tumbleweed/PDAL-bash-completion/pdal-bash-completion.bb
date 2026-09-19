SUMMARY = "Bash completion for PDAL"
DESCRIPTION = "This package contain the bash completion command for PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.10.2"

RPM_NAME = "PDAL-bash-completion-2.10.2-1.1.noarch.rpm"
RPM_HASH = "dfd19a37a2e5f23bfb2f777dfcdac7618bc7fbb5445d987e75225d34368b7b0b0a27fd9e50174dfd9ce7cc19894a4fe6916eb66eb6699c1c441c0e07d2b1a780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
