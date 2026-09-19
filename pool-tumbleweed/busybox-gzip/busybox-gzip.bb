SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-gzip-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e90ddb284147310679be37b284d1185ff78878afd545199b8c3ffd570075c6c019d1b1562f103631cde97d9bc3868b0ae09e9a743549466250e79bc57fd51d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
