SUMMARY = "Ancient Semitic Fonts"
DESCRIPTION = "Collection of fonts related to the history of the Hebrew writing."
LICENSE = "GPL-2.0"

PV = "0.06.1"

RPM_NAME = "culmus-ancient-semitic-fonts-0.06.1-3.25.noarch.rpm"
RPM_HASH = "966377bf3abed48c134c573d947ea7627ee1380764a4e5c8e2f704b4b8d124add792be29928ddbe11e85c7a585cd2a0fc4af42c97c3d6236fbdddcebe92e0fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "culmus-ancient-semitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
