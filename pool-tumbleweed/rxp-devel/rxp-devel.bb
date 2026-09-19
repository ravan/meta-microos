SUMMARY = "Development files for rxp"
DESCRIPTION = "The rxp-devel package contains libraries and header files for \
developing applications that use rxp."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "rxp-devel-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "64c19dc3eff722bc7e865420edfa221f3f1fe387ce077f0f8de3c1f308b9ded694617e22b14a65a484ed510d2cc7de7ed318712e1e39287fbaee2958a7edb0f1"

RPROVIDES:${PN} += "rxp-devel"

RDEPENDS:${PN} += "librxp0"

inherit rpm
