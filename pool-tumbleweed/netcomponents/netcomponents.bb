SUMMARY = "Internet Protocol Suite Java Library"
DESCRIPTION = "NetComponents is an Internet protocol suite Java library originally \
developed by ORO, Inc.	This version supports Finger, Whois, TFTP, \
Telnet, POP3, FTP, NNTP, SMTP, and some miscellaneous protocols like \
Time and Echo as well as BSD R command support.  The purpose of the \
library is to provide fundamental protocol access, not higher-level \
abstractions.  Therefore, some of the design violates object-oriented \
design principles.  Its philosophy is to make the global functionality \
of a protocal accesible (for example, TFTP send file and receive file) \
when possible, but also provide access to the fundamental protocols \
where applicable so that the programmer can construct custom \
implementations (for example, the TFTP packet classes and the TFTP \
packet send and receive methods are exposed)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "netcomponents-1.3.8-302.10.noarch.rpm"
RPM_HASH = "df04830308b13cf2c39359baead416e9de99065b78d73d52e6a4869c343ab5603caa335903629ddfbe606d03145e36be6d4f585cfcbe617b9fde41ef3fe1694b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcomponents"

RDEPENDS:${PN} += ""

inherit rpm
