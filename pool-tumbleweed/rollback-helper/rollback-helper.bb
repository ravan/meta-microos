SUMMARY = "Helper Scripts for system rollback"
DESCRIPTION = "The rollback-helper package is a collection of scripts, which, \
after a successfull filesystem rollback with snapper, resets \
registered products on SCC or SMT."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20260114.38e2a69"

RPM_NAME = "rollback-helper-1.0+git20260114.38e2a69-1.3.noarch.rpm"
RPM_HASH = "b459aff5d341f547d82dff01924fddc835af90ebee5e21148243ec99dc4aa12142814ffd94fd812b2b4d363eaf15a3df84f9a23ab616d744afe532ea0427ee76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rollback-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
SUSEConnect \
systemd"

inherit rpm
