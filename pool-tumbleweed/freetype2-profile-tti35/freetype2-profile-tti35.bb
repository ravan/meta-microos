SUMMARY = "Set TrueType interpreter to version 35"
DESCRIPTION = "System environment for set TrueType interpreter to version 35. \
In release 2.6.4, a new hinting mode for TrueType fonts was added, \
which enabled by default to activate sub-pixel hinting for TrueType. \
This broke the work of full hinting. This optional package with a bash profile \
that will switch the TrueType Interpreter to the old version 35."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.14.3"

RPM_NAME = "freetype2-profile-tti35-2.14.3-1.2.noarch.rpm"
RPM_HASH = "e82cccdd812e7aa2ce81d6262aac16886234cdf001bbd7ffba22bb44d9b9d3a671cd083c0939967c96d172b860a496740c96fed2536a6c1a0845a59cd6d7053c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-freetype2-profile-tti35 \
freetype2-profile-tti35"

RDEPENDS:${PN} += "bash \
freetype2"

inherit rpm
