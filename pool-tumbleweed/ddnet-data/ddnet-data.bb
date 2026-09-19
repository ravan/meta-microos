SUMMARY = "Data files for ddnet"
DESCRIPTION = "Data files for DDraceNetwork (DDNet)."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "20.0"

RPM_NAME = "ddnet-data-20.0-1.1.noarch.rpm"
RPM_HASH = "3d2d8c4b8c61234c2c62c0c29051a9935314850c968f1b66469cfa2b212840a242d250196ddbdd95b876008b3b5f2fbe5fda4f95145f687e708ab89c56005d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddnet-data"

RDEPENDS:${PN} += "ddnet"

inherit rpm
