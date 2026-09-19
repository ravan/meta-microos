SUMMARY = "resource-agent for ZFS support"
DESCRIPTION = "Containing the resource agent and documentation for ZFS support"
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.18.0+git94.6c50a9b"

RPM_NAME = "resource-agents-zfs-4.18.0+git94.6c50a9b-1.1.aarch64.rpm"
RPM_HASH = "330c2447f2c7888fe828c4150941f65959ecab0324cac599ee129b8cc3ca6aa1c1125d7653ba3baaf930b721b6edf1bac3b2215bb0da311419036bf49d991606"

RPROVIDES:${PN} += "resource-agents-/usr/lib/ocf/resource.d/heartbeat/ZFS \
resource-agents-/usr/share/man/man7/ocf-heartbeat-ZFS.* \
resource-agents-zfs"

RDEPENDS:${PN} += "/usr/bin/sh \
resource-agents"

inherit rpm
