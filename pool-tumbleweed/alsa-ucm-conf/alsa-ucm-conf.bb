SUMMARY = "ALSA UCM Profiles"
DESCRIPTION = "This package contains the profiles files for ALSA UCM (Use Case Manager)."
LICENSE = "BSD-3-Clause"

PV = "1.2.16.1"

RPM_NAME = "alsa-ucm-conf-1.2.16.1-1.2.noarch.rpm"
RPM_HASH = "133aae1379309c71f7d6bdf922324008b9a67740fe2fa31131952da9b2cc735886a1a8242056d608efc0bb92c5f50d27c2067dda6ad479ec06245bad885bfff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-ucm-conf"

RDEPENDS:${PN} += "libasound2"

inherit rpm
