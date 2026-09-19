SUMMARY = "Theme opensuse-beat for Plymouth"
DESCRIPTION = "Theme opensuse-beat for Plymouth."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "plymouth-theme-opensuse-beat-1.0-1.16.noarch.rpm"
RPM_HASH = "e1a741fcee0bfb51f68bae3783465100996123f19d03cf2767cb6bc5a02a941fb2317972efed5ee3c9fedd2276ef03f7a5a60168694dcd7a6d9522cecfa12881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-opensuse-beat"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-scripts \
plymouth-theme-script"

inherit rpm
