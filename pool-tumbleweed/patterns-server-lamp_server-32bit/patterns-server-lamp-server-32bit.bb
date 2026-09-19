SUMMARY = "Web and LAMP Server"
DESCRIPTION = "The 32bit pattern complementing lamp_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-lamp_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "4da02eb8bade39523d2b182572585a50c954ceee47f660339ad5f3ac1f5b692f71b16be1021da6639b25f1e6cdbd1db5412a45c9f684a73e2400bde05598e825"

RPROVIDES:${PN} += "pattern- \
patterns-server-lamp-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
