SUMMARY = "Translations for package libpurple-plugin-bot-sentry"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-bot-sentry' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libpurple-plugin-bot-sentry-lang-1.3.0-3.3.noarch.rpm"
RPM_HASH = "b028a4d60d4d8dc43a3867b8b2a076def486a577f3c82b1286f2504a42ef5d5ddfcd70b0cbd457b9893c7d53f86a395ee9912d77203ed5757eeee8500cd79920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-bot-sentry-lang \
libpurple-plugin-bot-sentry-lang-all \
locale-libpurple-plugin-bot-sentry-ar \
locale-libpurple-plugin-bot-sentry-cs \
locale-libpurple-plugin-bot-sentry-de \
locale-libpurple-plugin-bot-sentry-es \
locale-libpurple-plugin-bot-sentry-it \
locale-libpurple-plugin-bot-sentry-ru"

RDEPENDS:${PN} += "libpurple-plugin-bot-sentry"

inherit rpm
