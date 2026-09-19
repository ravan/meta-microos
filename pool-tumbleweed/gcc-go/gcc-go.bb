SUMMARY = "The system GNU Go Compiler"
DESCRIPTION = "The system GNU Go Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-go-16-1.1.aarch64.rpm"
RPM_HASH = "38d21d300bdfb9b4e5aac650468c2522b4d147cecba7c74aeb6ebdb35dd5e239f9268485a8816fb3f281072c4180c5d8b7b1755791c75da9ef1096bfe2cdf957"

RPROVIDES:${PN} += "gcc-go"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
gcc16-go"

inherit rpm
