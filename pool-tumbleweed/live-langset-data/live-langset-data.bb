SUMMARY = "Scripts and data to allow locale switching in live media"
DESCRIPTION = "This package contains scripts and data to allow setting the locale (+ console font, keyboard \
layout and timezone) on live media."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "live-langset-data-3.0-2.1.noarch.rpm"
RPM_HASH = "65c78d4b58e767a88c7130cd499374d1fda75398e964f62b44b98e47c71d0c63d17dcf80a1ca2b9cb2fa35c913175d9bb083c9a3e172f29c712d98a6c329c13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "live-langset-data"

RDEPENDS:${PN} += "/usr/bin/sh \
sed \
systemd"

inherit rpm
