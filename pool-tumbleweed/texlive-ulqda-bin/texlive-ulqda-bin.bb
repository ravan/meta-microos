SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-ulqda-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "50a0ef42ce52aa1e99d980d9af3a202f84fb3cdc50f893727fb9a560a4095a988eb490349840dde6c3934995b6dfb961e6ddb33c17197a4c6db020430e7c6b82"

RPROVIDES:${PN} += "texlive-ulqda-bin"

RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm
