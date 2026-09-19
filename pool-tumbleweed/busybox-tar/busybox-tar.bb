SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-tar-1.38.0-42.2.noarch.rpm"
RPM_HASH = "d5b7663b18e2b8a19a300157b9a351a5d92529d7e895fdb65603aae5a4c4546aebeb79c5a21c0abcaa298c7a2293e6563575687ffe8068b609d55e72d37905e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/tar \
busybox-tar"

RDEPENDS:${PN} += "busybox"

inherit rpm
