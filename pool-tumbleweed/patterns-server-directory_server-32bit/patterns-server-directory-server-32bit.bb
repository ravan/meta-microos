SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "The 32bit pattern complementing directory_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-directory_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "402680a5c699bf2a8416bbb3877bf3c8de0e236a991ce5b15ea6958cbc797aecc783bb10b62fd613d8ac129fe9d47459687e14c88c413d86a76af5abdf0a4881"

RPROVIDES:${PN} += "pattern- \
patterns-server-directory-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
