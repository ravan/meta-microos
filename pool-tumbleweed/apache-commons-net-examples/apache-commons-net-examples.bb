SUMMARY = "Internet protocol suite Java library (Examples)"
DESCRIPTION = "This is an Internet protocol suite Java library originally developed by \
ORO, Inc.  This version supports Finger, Whois, TFTP, Telnet, POP3, FTP, \
NNTP, SMTP, and some miscellaneous protocols like Time and Echo as well \
as BSD R command support. The purpose of the library is to provide \
fundamental protocol access, not higher-level abstractions. \
 \
This package contains the examples."
LICENSE = "Apache-2.0"

PV = "3.13.0"

RPM_NAME = "apache-commons-net-examples-3.13.0-1.3.noarch.rpm"
RPM_HASH = "880e24d800a11bb66b3d9b75d939df669533c2afeb000e9a59ae35d9dc5658486ac4fd0cc13055dbac4fb2d841794a4744bdd7a3c67cf87d8d4e421cb2a0bfa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net-examples \
mvn-commons-net-commons-net--examples-"

RDEPENDS:${PN} += "apache-commons-net \
java-headless \
javapackages-filesystem"

inherit rpm
