SUMMARY = "A tool for creating identity management server instances"
DESCRIPTION = "The program assists system administrators to create new directory server and \
Kerberos server instances that help to maintain centralised user identity \
database for a network."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-auth-server-5.0.1-1.1.noarch.rpm"
RPM_HASH = "1fcd6d037104741508bf5f3a7ea0db3013b058c3dbf6d2eccf6dac7f490825f9288da043b2400b13d840942159cfff8ed8720b3c61078aa6f25cc149489e023a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-auth-server"

RDEPENDS:${PN} += "net-tools \
yast2 \
yast2-ruby-bindings"

inherit rpm
