SUMMARY = "Files for development using cldr-annotations"
DESCRIPTION = "This package contains the pkg-config files for development \
when building programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-devel-36.12.120191002_0-1.18.noarch.rpm"
RPM_HASH = "9b05d53195dc94afa8904064a5c9add20a4c91479fe4e5844a233c80cca867f62e1bcdd471fce8c7aca6a7ddd91fe12a8b2a20d5a11d73d962ec56c17d1dc57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation-devel \
pkgconfig-cldr-emoji-annotation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cldr-emoji-annotation"

inherit rpm
