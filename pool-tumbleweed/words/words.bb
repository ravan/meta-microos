SUMMARY = "An English words dictionary"
DESCRIPTION = "This package contains an English words dictionary which will be installed as \
 \
/usr/share/dict/american and linked to /usr/share/dict/words \
 \
The symbolic link may be used by look(1) and ispell(1). \
 \
For a British or Canadian version of such a words dictionary you may install \
words-british or words-canadian respectively."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.02.25"

RPM_NAME = "words-2026.02.25-1.1.noarch.rpm"
RPM_HASH = "f3ca9dcaa849468a1393528475931f9d11c63c831052b70da2eee5ff8367c81ff0dd2dd54bb25f38be07a62f1f4a4025829741896b2a0ab0238ae6b825e25048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scowl \
words"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
