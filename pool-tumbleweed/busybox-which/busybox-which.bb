SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-which-1.38.0-42.2.noarch.rpm"
RPM_HASH = "d6654d58fb7929f00c5f91055ab5c11dfaa5d263d225578b61ae3be5521e92d6f2f0aadd622ff91b058dd92d14a8bc15861eb7ff975f2c9f586e34b461c572dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"

RDEPENDS:${PN} += "busybox"

inherit rpm
