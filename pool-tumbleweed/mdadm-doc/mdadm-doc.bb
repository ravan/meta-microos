SUMMARY = "Linux Software RAID HOWTO"
DESCRIPTION = "This package contains the Linux Software RAID HOWTO."
LICENSE = "GPL-2.0-only"

PV = "4.5+44.gf732de3f"

RPM_NAME = "mdadm-doc-4.5+44.gf732de3f-1.3.aarch64.rpm"
RPM_HASH = "06640ae5a390caff38d328b9fe2c1a27a9358d6f71fdd75b0ed998ec06cb11e06488c62da7d2c4c70b928154c0a27467003c9494c016b5fc12a71f10f005fb60"

RPROVIDES:${PN} += "mdadm-doc"

RDEPENDS:${PN} += ""

inherit rpm
