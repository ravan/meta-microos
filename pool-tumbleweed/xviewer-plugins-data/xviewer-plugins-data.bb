SUMMARY = "Common data for xviewer-plugins"
DESCRIPTION = "Common data required by all xviewer plugins"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugins-data-3.4.3-1.2.noarch.rpm"
RPM_HASH = "28515126c6b80e720ee6e20ef770a9a29a82c8e8dcfddaee2550fcdb5dde5fba3335efbcb963713fd5f21b66bcf1a2ea48458e0d0365a07405a03a583320548c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xviewer-plugins-data"

RDEPENDS:${PN} += "xviewer"

inherit rpm
