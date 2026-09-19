SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-attica-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "093304bd3f538673e956b161f9c56cecd3b59177fb2bf1bb93a11b0af96ef071ecb75e802040fe36ca29da26ee0a1bd320ff7484d5f0f8b8c0213e108ac5c3a6"

RPROVIDES:${PN} += "kf6-attica"

RDEPENDS:${PN} += ""

inherit rpm
