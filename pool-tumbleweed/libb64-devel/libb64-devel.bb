SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "2.0.0.1"

RPM_NAME = "libb64-devel-2.0.0.1-1.3.aarch64.rpm"
RPM_HASH = "15b64875b6bba926842cd68a2a978e5c947c3ff2bad4509bd24de6908a7c4a38bf22ffbc3380b9a4ff8db3e645fd5100f2536c298962d72ded111642cad3cf09"

RPROVIDES:${PN} += "libb64-devel"

RDEPENDS:${PN} += "libb64-1"

inherit rpm
