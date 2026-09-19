SUMMARY = "Haveged development files"
DESCRIPTION = "Headers and for the haveged library \
 \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.21"

RPM_NAME = "haveged-devel-1.9.21-1.3.aarch64.rpm"
RPM_HASH = "a99ab05631fe5c9e3fe0c931d50115fc1eb94ab5fcda3aae1603bd0ecda300f3ff8fdace6d88faa51a209b786400da035bfeaa07f38abafcbff5da468edf0dce"

RPROVIDES:${PN} += "haveged-devel"

RDEPENDS:${PN} += "libhavege2"

inherit rpm
