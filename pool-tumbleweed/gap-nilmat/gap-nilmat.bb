SUMMARY = "GAP: Computing with nilpotent matrix groups"
DESCRIPTION = "This package contains methods for checking whether a given matrix \
group is nilpotent and for computing with nilpotent matrix groups. \
The considered matrix groups may be matrix groups over a finite field \
or the field of rational numbers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "gap-nilmat-1.4.2-1.9.noarch.rpm"
RPM_HASH = "cd57a82593c38aa8ea5fd0cf6af46ea01f4cbb91139a4bfc282918a2fb60a7cb3755519b650b24a9964b9301c74b66f9e4d315627260992e5eedf37b7df97a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-nilmat"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-polenta"

inherit rpm
