SUMMARY = "Translations for package libKF6CalendarCore6"
DESCRIPTION = "Provides translations for the 'libKF6CalendarCore6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6CalendarCore6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "437e148d6009937f2079e4c1bef344e227dcc22dbfece913a6a041a44741588e51b8b25ab7db4e8a33bd3e07f002a713c7d49585bac430ce0e2a27fd0cf06512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6CalendarCore6-lang \
libKF6CalendarCore6-lang-all \
locale-libKF6CalendarCore6-ar \
locale-libKF6CalendarCore6-ca \
locale-libKF6CalendarCore6-ca@valencia \
locale-libKF6CalendarCore6-de \
locale-libKF6CalendarCore6-en \
locale-libKF6CalendarCore6-es \
locale-libKF6CalendarCore6-eu \
locale-libKF6CalendarCore6-fr \
locale-libKF6CalendarCore6-he \
locale-libKF6CalendarCore6-it \
locale-libKF6CalendarCore6-ka \
locale-libKF6CalendarCore6-nl \
locale-libKF6CalendarCore6-pt-BR \
locale-libKF6CalendarCore6-sk \
locale-libKF6CalendarCore6-sl \
locale-libKF6CalendarCore6-tr \
locale-libKF6CalendarCore6-uk \
locale-libKF6CalendarCore6-zh-CN"

RDEPENDS:${PN} += "libKF6CalendarCore6"

inherit rpm
