SUMMARY = "Development files for libvc"
DESCRIPTION = "Development files for libvc."
LICENSE = "LGPL-2.1-only"

PV = "013"

RPM_NAME = "libvc-devel-013-1.3.aarch64.rpm"
RPM_HASH = "9b8f02128a822409a4f45e497a67a2d03e855128f168356abd2454a5a3c27b976d5908303c513f39a51c0451a1a4b9ac7b68d2959ac570727f63c3e51cb27ba0"

RPROVIDES:${PN} += "libvc-devel"

RDEPENDS:${PN} += "libvc0"

inherit rpm
