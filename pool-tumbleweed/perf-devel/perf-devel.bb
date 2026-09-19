SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-devel-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "455d4bd33be579389bdf31dce1297865af2ddc77ed06b91b114552d40431f8d37c8693c18fc517f6367c682b595553d73cb11854720c826dd61eca01f5e8d1f8"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm
