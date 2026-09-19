SUMMARY = "Mail and News Server"
DESCRIPTION = "Software to set up electronic mail and message services to handle email, mailing, and news lists, including a virus scanner to scan messages at the server level."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-mail_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "4e3a76be8b9f61ca43ad6b2202b96e82429e9330d452bbb5f6a9a8116a2dadff69ee0be292a8e3be16b2c5d4747bdf3dc540874f52a80c9cbe873e48c239fa09"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-mail-server \
patterns-server-mail-server"

RDEPENDS:${PN} += "pattern- \
vacation"

inherit rpm
