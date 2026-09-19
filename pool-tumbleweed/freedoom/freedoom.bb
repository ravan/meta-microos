SUMMARY = "Replacement game files for Doom game engines"
DESCRIPTION = "Though the Doom engine source code is libre, the original game data \
(graphics, maps, etc.) is not. Freedoom is an alternate game data set \
that can be used with a Doom engine, such as prboom-plus, \
chocolate-doom or gzdoom, to form a free Doom-based game."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "freedoom-0.13.0-1.9.noarch.rpm"
RPM_HASH = "6c6318412c9201db1e215a5108d16b02a7b28beb554145280daff159725b1de8d00eb01dec249447300d99a1d229d2cdeab4530afe5f97e49ba71661755d5e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freedoom"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
