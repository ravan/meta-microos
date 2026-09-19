SUMMARY = "Header files for the NetPBM libraries"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "11.14.0"

RPM_NAME = "libnetpbm-devel-11.14.0-1.3.aarch64.rpm"
RPM_HASH = "ced8959c2e8178634f8247db7e61d4fb3ca43f520cb296e580ec0508be5950bae0fefd568e18e6ad6e1505e5f162c9a1696692bbfd7e2ae5802a44ab4491401b"

RPROVIDES:${PN} += "libnetpbm-devel"

RDEPENDS:${PN} += "libnetpbm11"

inherit rpm
