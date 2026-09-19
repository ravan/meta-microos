SUMMARY = "MuJS development files"
DESCRIPTION = "This package provides the MuJS static library."
LICENSE = "ISC"

PV = "1.3.7"

RPM_NAME = "mujs-devel-1.3.7-3.5.aarch64.rpm"
RPM_HASH = "9b0a093f77feb0dd7b986b5bc5f9c11c8a384ad3566d885fda9c0bdff16632a63e7b7460952ddb15e6eab53c306e9561cdd0bc632e859ca6aa933127b4e93572"

RPROVIDES:${PN} += "mujs-devel \
mujs-static \
pkgconfig-mujs"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
