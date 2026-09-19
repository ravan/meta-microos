SUMMARY = "The hxtools shell environment"
DESCRIPTION = "Bash environment settings from hxtools. Particularly, this provides \
the SUSE 6.x ls color scheme, and a reduced PS1 that shows only the \
rightmost parts of a path."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "hxtools-profile-20251011-1.6.noarch.rpm"
RPM_HASH = "e39620342d6bd60b39aa66ed3455a65f4e89e489b7fffc8f6c8b08e38967a1f8bc74ce355db441f3623355884445779f5779f645cd7af3f13e7e3efeb5022a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hxtools-profile \
hxtools-profile"

RDEPENDS:${PN} += "hxtools \
hxtools-data \
hxtools-scripts"

inherit rpm
