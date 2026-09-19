SUMMARY = "LIRC Configuration Tools and Data"
DESCRIPTION = "The LIRC config package contains tools and data  to ease the \
LIRC configuration process."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-config-0.10.2-2.5.noarch.rpm"
RPM_HASH = "c5cbc4e8c3c9e744ccb13bd3903842b2f3e01c89ca1885b77e65da4df21294b6d33526ef0fe61b8c85d2ccb1dfcfb0381815b4ec3569505f6c4e174c791e7700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lirc-config \
lirc-remotes"

RDEPENDS:${PN} += "lirc-core \
python3-PyYAML \
python3-gobject"

inherit rpm
