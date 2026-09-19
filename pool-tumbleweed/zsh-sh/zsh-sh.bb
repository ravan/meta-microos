SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use zsh as /bin/sh implementation."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-sh-5.9-12.7.noarch.rpm"
RPM_HASH = "8a47ae825788c9942044e12d6d02fa2463f5de5808e707ad2ed3e591c5f745850bfe778c8dedfee28e23d5ba31028dbc08ff5bda8eae148c7d36766ef5f05d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
zsh-sh"

RDEPENDS:${PN} += "zsh"

inherit rpm
