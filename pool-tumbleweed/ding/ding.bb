SUMMARY = "An X Window System Dictionary Tool"
DESCRIPTION = "Ding is a graphical frontend to an English-to-German dictionary \
lookup and word spell checking. For full functionality, agrep and \
ispell should be installed."
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "ding-1.9-3.9.noarch.rpm"
RPM_HASH = "d65515ed9954cb75c4dcdadc67e68e9f79b8b6936c4ab39d82a43474d41675456523fbf4b94fd8704f0be4b74aba9ce5ac04a09136b183bc808f579844730271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ding"

RDEPENDS:${PN} += "/usr/bin/sh \
ding-dict-de-en \
tcl \
tk"

inherit rpm
