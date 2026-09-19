SUMMARY = "Query various APIs and services via SQL language"
DESCRIPTION = "Steampipe is the zero-ETL way to query APIs and services. Use it to expose data sources to SQL."
LICENSE = "AGPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "steampipe-2.4.6-1.1.aarch64.rpm"
RPM_HASH = "36e66fce845d6972044f8dafd6ada399141efcb44d6abf15354bfa2c177d5ac272936194936585bc0940c949204daa739d9d16de1dd580e7bb6a5bc1ff65e4d6"

RPROVIDES:${PN} += "steampipe"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
