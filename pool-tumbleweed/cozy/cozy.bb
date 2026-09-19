SUMMARY = "Audio Book Player"
DESCRIPTION = "Play and organize your audio book collection."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "cozy-1.3.0-1.5.noarch.rpm"
RPM_HASH = "30f6ecba135c95d86d4f56537bf9410e839cfd08716ced5246e64bbbf5a8612a61c6349eaf2a17409fa8da41012a6e96f19f12902b447d0c3042ac185d160992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "com.github.geigi.cozy \
cozy"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-distro \
python3-injector \
python3-mutagen \
python3-peewee \
python3-pytz \
python3-requests"

inherit rpm
