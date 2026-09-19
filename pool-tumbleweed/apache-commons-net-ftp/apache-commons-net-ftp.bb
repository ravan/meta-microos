SUMMARY = "Internet protocol suite Java library (FTP)"
DESCRIPTION = "This is an Internet protocol suite Java library originally developed by \
ORO, Inc.  This version supports Finger, Whois, TFTP, Telnet, POP3, FTP, \
NNTP, SMTP, and some miscellaneous protocols like Time and Echo as well \
as BSD R command support. The purpose of the library is to provide \
fundamental protocol access, not higher-level abstractions. \
 \
This package contains the FTP related subset of classes."
LICENSE = "Apache-2.0"

PV = "3.13.0"

RPM_NAME = "apache-commons-net-ftp-3.13.0-1.3.noarch.rpm"
RPM_HASH = "050875d3195a3489a7a05eb0967153f87644fd940936f3b90134e137fe6641c5b618fca2369316af24d8a5d6675ea5bc0699e2aa06aa2de544bd5a445baee55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net-ftp \
mvn-commons-net-commons-net--ftp-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
