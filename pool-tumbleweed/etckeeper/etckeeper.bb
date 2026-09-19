SUMMARY = "Store /etc under Version Control"
DESCRIPTION = "The etckeeper program is a tool to let /etc be stored in a git, \
mercurial, bzr or darcs repository. It hooks into yum to automatically \
commit changes made to /etc during package upgrades. It tracks file \
metadata that version control systems do not normally support, but that \
is important for /etc, such as the permissions of /etc/shadow. It is \
quite modular and configurable, while also being simple to use if you \
understand the basics of working with version control."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.22"

RPM_NAME = "etckeeper-1.18.22-1.4.noarch.rpm"
RPM_HASH = "9bff8b55417a2c40e75b61dda35b3850505a0026c5b365419ad31539c409f83cca5376f7fab639f9798e56b3d9ca731cc97406f94cb6d185de7f28eef70a91f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-etckeeper \
etckeeper"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
