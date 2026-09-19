SUMMARY = "Translations for package lxqt-session"
DESCRIPTION = "Provides translations for the 'lxqt-session' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-session-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "a89dcee26f0cf24fd3fa602c9f86be24df7fd4c1bcc285bdf98f2c4e0485f3ea37d909f6d561c1fd98c758fa1e8b1d296d37c373d7e0d5fd20cc1aa89550ae6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-session-lang \
lxqt-session-lang-all"

RDEPENDS:${PN} += "lxqt-session"

inherit rpm
