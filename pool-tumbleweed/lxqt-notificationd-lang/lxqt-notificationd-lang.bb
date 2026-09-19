SUMMARY = "Translations for package lxqt-notificationd"
DESCRIPTION = "Provides translations for the 'lxqt-notificationd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-notificationd-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "07310c29682d031f5871dda8851b7b4f4119984890596e5095f65c7e2f787f2404a0e82eb9ae14b101b02749facf40c26b5ff1b41d99d6b8c47871847b65a5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-notificationd-lang \
lxqt-notificationd-lang-all"

RDEPENDS:${PN} += "lxqt-notificationd"

inherit rpm
