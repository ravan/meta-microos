SUMMARY = "Sans-serif casual script typeface"
DESCRIPTION = "Comic Shanns is a sans-serif casual script typeface inspired by Comic \
Sans (MS). Comic Shanns has slightly better weight management, and \
the issue of letterfit is not as much a concern in a monospace \
setting anyway."
LICENSE = "MIT"

PV = "1.3.0+git15"

RPM_NAME = "jesusmgg-comicshanns-fonts-1.3.0+git15-1.6.noarch.rpm"
RPM_HASH = "456b1e8d2ca165a9d58614deb04040a35c69f85c8b3806c14b77a74af615c7a0dbb9950b9bb5e41cf7876bfe3b1072df0918b07a86c8cb200814433f35e09f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jesusmgg-comicshanns-fonts \
shannpersand-comicshanns-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
