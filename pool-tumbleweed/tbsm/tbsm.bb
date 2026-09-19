SUMMARY = "A pure bash session or application launcher"
DESCRIPTION = "tbsm is an application or session launcher, written in pure bash with no ncurses or dialog dependencies. It is inspired by cdm, tdm, in some way by krunner and related."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "tbsm-0.7-2.4.noarch.rpm"
RPM_HASH = "e253d9d58a645bf2bbd0b821450c60918b016ed2112a04913458733c50682eaec2c30bf4fae22d4d04e698e1f6232df817e3b081f3a1e1063ff29655f2240262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tbsm \
tbsm"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
