SUMMARY = "Documentation for GLab"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.115.0"

RPM_NAME = "glab-doc-1.115.0-1.1.noarch.rpm"
RPM_HASH = "a24a5e2fa5f92c3069c872da9db5dbcfe97799fc433d210467337226762d01888852efef0fee217968873be55ae530198ed3a3f7be58b1064ed0d35f4ae6d657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-doc"

RDEPENDS:${PN} += ""

inherit rpm
