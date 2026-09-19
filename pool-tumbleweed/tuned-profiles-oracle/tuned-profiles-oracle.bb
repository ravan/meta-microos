SUMMARY = "Additional tuned profiles targeted to Oracle loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon,  targeted to Oracle loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-oracle-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "13190e34cf6d15c057daf50b533dd1b55dd0b154c18cdb1e7aacf379afb9fb8356dc7e5d78f4669e5995f3d429f0c7fcf1ada1c6b016a46261f936e09aa8cf86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-oracle"

RDEPENDS:${PN} += "tuned"

inherit rpm
