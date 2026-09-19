SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-unzip-1.38.0-42.2.noarch.rpm"
RPM_HASH = "5468eee666d036ee16a1eb6245b54bab37ead2beace9e5f52f8e183e4f1872fa4a219996ed1eb3755654a200574b47e2476fdf170e3a054396b934329f455c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"

RDEPENDS:${PN} += "busybox"

inherit rpm
