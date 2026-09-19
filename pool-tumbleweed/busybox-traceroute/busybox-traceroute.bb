SUMMARY = "Busybox applets replacing traceroute"
DESCRIPTION = "This package contains the symlinks to replace traceroute with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-traceroute-1.38.0-42.2.noarch.rpm"
RPM_HASH = "d2ed35ffe601bf393bf207e9fc9b828c56617d6feee91f8f45ff3c8bd6bed562df625f1bc089619aa6d3fe8cddfef247bd82d568d98bcf3001c1d6e5e39967d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-traceroute"

RDEPENDS:${PN} += "busybox"

inherit rpm
