SUMMARY = "Command-line interface to Phorge"
DESCRIPTION = "Arcanist is the command-line tool for Phorge. \
It allows you to interact with Phorge installs to send code for review, \
download patches, transfer files, view status, make API calls, and various other \
things."
LICENSE = "Apache-2.0 & MIT"

PV = "2026.27"

RPM_NAME = "arcanist-2026.27-1.1.noarch.rpm"
RPM_HASH = "5bf5c1f2448b477bc71a8f232a92d6130a27fde65915973e3f758395915ea5e4911affe4dcd9a260ab0f3f2bd71002771392de7996c19cc61d9168e6fdfe1db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arcanist \
php7-libphutil"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/php8 \
/usr/bin/sh \
ca-certificates \
php8 \
php8-curl"

inherit rpm
