SUMMARY = "Development files for Vacuum-IM"
DESCRIPTION = "This package includes files needed to develop Vacuum-IM modules."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1639054987.g0abd5e1"

RPM_NAME = "vacuum-im-devel-1.3.0+git1639054987.g0abd5e1-1.9.aarch64.rpm"
RPM_HASH = "f2e0a19665439fe85c95f712cb65970b11d79853540cfda60e04593953ab24eeee1cde6804e5a270bda01e454294a8278498529f3358a5a659267b7fed6f3730"

RPROVIDES:${PN} += "vacuum-im-devel"

RDEPENDS:${PN} += "libvacuumutils37 \
vacuum-im"

inherit rpm
