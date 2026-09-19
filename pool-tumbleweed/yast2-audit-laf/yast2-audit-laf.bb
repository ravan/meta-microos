SUMMARY = "YaST2 - Configuration of Linux Auditing (LAF)"
DESCRIPTION = "This module allows the configuration of the audit daemon as well as to \
add rules for the audit subsystem."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-audit-laf-5.0.1-1.2.noarch.rpm"
RPM_HASH = "1b043a5916485c9aa6cdcb645a8b493887d6e5e73644ec9f01f68b1da312c19606f4a3fba5211e2607f4a17d1fbf78da4942fbe2085e2f29bde5a35a8aeaf34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-audit-laf"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
