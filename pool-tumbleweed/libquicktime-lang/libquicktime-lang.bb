SUMMARY = "Translations for package libquicktime"
DESCRIPTION = "Provides translations for the 'libquicktime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-lang-1.2.4+git20180804.fff99cd-9.7.noarch.rpm"
RPM_HASH = "8e9650cdf95ac044b72c4d53823d85c2c9822de920b2d6bb52b80b927e9442e42342a52fee15f07a1b2d8b3a6626b378b74081e97ac3d588e284d1f3d1aa8e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquicktime-lang \
libquicktime-lang-all \
locale-libquicktime-de"

RDEPENDS:${PN} += "libquicktime"

inherit rpm
