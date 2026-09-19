SUMMARY = "Development files for pgvector"
DESCRIPTION = "This package holds the development files to build other extensions to support pgvector."
LICENSE = "PostgreSQL"

PV = "0.8.3"

RPM_NAME = "pgvector-devel-0.8.3-1.2.aarch64.rpm"
RPM_HASH = "66001ca9f62b371fe1f3ff3dcc67e94ec76cc4d8317d335e44edb3b741738f9c7c853d9ee649da0bdcaf01ac31960afa08083da34ac7287b5ae70e7aee475354"

RPROVIDES:${PN} += "pgvector-devel"

RDEPENDS:${PN} += ""

inherit rpm
