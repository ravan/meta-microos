SUMMARY = "A humanist, monospace font based on DejaVu"
DESCRIPTION = "A humanist, monospace font based on DejaVu Sans Mono and inspired by \
André Berg's Meslo."
LICENSE = "OFL-1.1"

PV = "2.10"

RPM_NAME = "regularhunter-monotional-fonts-2.10-1.3.noarch.rpm"
RPM_HASH = "076eb83770da6039368a86305f9937db295032ed6cdb60b4ca5c75ebcb4cc5f2edc5b7b8f2ba22da0f91e7467af6ad4721357beb321d5b2c4277eced76575901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regularhunter-monotional-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
