SUMMARY = "Mail and News Server"
DESCRIPTION = "The 32bit pattern complementing mail_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-mail_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "216d706459c3f2c7f43a75e0f5e33972a0f6ea38fafcb2cd22e72f4cccaaafa85b384c0162c91fb0fc4d421f958d28763abd6fb7d763958abfc148accb22e392"

RPROVIDES:${PN} += "pattern- \
patterns-server-mail-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
