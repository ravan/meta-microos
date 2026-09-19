SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "A compatibility layer allowing applications written for libudunits to \
work with libudunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-2.2.28-2.8.aarch64.rpm"
RPM_HASH = "8265f366ea7e586f62edc370820ca3d7cc240a03e3cbc11f5136be593379eec3f35517caa43cdfb41ad3b6c5e6ed9cb169f2edfe3a884e9f147e2d027dc5afe6"

RPROVIDES:${PN} += "udunits \
udunits-compat"

RDEPENDS:${PN} += "/sbin/ldconfig \
udunits2"

inherit rpm
