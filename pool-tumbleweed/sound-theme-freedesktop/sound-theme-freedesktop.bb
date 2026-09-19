SUMMARY = "freedesktop.org sound theme"
DESCRIPTION = "The default freedesktop.org sound theme following the XDG theming \
specification.	(http://0pointer.de/public/sound-theme-spec.html)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "sound-theme-freedesktop-0.8-9.19.noarch.rpm"
RPM_HASH = "eda6966bea6e6f055327258dbad4333d9bef4cae70261c9578e0eb4d7a2073ba6665c71638385a8344a36e4e7eea135cfae886b2ca4421ba8fb97b42d030fd1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sound-theme-freedesktop"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/touch"

inherit rpm
