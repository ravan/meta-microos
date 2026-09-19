SUMMARY = "Documentation for qt6-location in QCH format"
DESCRIPTION = "This package contains documentation for qt6-location in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "855b4964ddd953cbeabe3def311fb9d4249983d6c0ad3fc0c8ce19409c0b5fb72b61bc6e25bac593634bc8600cbc670de487ecd57adfe78b98b83d5e86ddf92f"

RPROVIDES:${PN} += "qt6-location-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
