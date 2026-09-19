SUMMARY = "Internet protocol suite Java library"
DESCRIPTION = "This is an Internet protocol suite Java library originally developed by \
ORO, Inc.  This version supports Finger, Whois, TFTP, Telnet, POP3, FTP, \
NNTP, SMTP, and some miscellaneous protocols like Time and Echo as well \
as BSD R command support. The purpose of the library is to provide \
fundamental protocol access, not higher-level abstractions."
LICENSE = "Apache-2.0"

PV = "3.13.0"

RPM_NAME = "apache-commons-net-3.13.0-1.3.noarch.rpm"
RPM_HASH = "fdea7230978139c51332e45edb459e2b3b78374e38aea13071f083e120ecb6191e27b1840bbd32dc304ff4189ec4335a014607a38bad6c0be93959d925fdb63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net \
commons-net \
jakarta-commons-net \
mvn-commons-net-commons-net \
mvn-commons-net-commons-net-pom- \
osgi-org.apache.commons.commons-net"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io"

inherit rpm
