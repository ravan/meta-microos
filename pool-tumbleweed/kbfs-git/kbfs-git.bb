SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "kbfs-git-6.6.3-4.1.aarch64.rpm"
RPM_HASH = "8c50b991ca7fa520ea3275790c6ade8e61e5235dbd83c466b299683657fa5e85e364a0ac78c02d7f75f16d7f54bc46316ae1c96e362035585605c243a31dd070"

RPROVIDES:${PN} += "kbfs-git"

RDEPENDS:${PN} += "kbfs \
keybase-client"

inherit rpm
