SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Static CGNS (CFD General notation system) library."
LICENSE = "Zlib"

PV = "4.4.0"

RPM_NAME = "cgns-devel-static-4.4.0-2.13.aarch64.rpm"
RPM_HASH = "675cafffd55485b24a3063fcbdcb061110aac4caee06695b118f67c743cf24ecc45e79fc18e61b21ccb165775b941becc9980a6a94d6af023294e05baaa0cb55"

RPROVIDES:${PN} += "cgns-devel-static"

RDEPENDS:${PN} += "cgns-devel"

inherit rpm
