SUMMARY = "Print Server"
DESCRIPTION = "The 32bit pattern complementing printing."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-printing-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "34e147804125168c2f72fc2299259a185a8dd1b02bcc5048d684748f269e65aba9721e5adec4d9568e6cb2fd20c1a630e1968c932cd355a48ebbe6b9f3aaa468"

RPROVIDES:${PN} += "pattern- \
patterns-server-printing-32bit"

RDEPENDS:${PN} += ""

inherit rpm
