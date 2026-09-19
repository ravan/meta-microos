SUMMARY = "Common Internet File System Client in 100% Java"
DESCRIPTION = "The jCIFS SMB client library enables any Java application to remotely \
access shared files and directories on SMB file servers(i.e. a \
Microsoft Windows 'share') in addition to domain, workgroup, and server \
enumeration of NetBIOS over TCP/IP networks. It is an advanced \
implementation of the CIFS protocol supporting Unicode, batching, \
multiplexing of threaded callers, encrypted authentication, \
transactions, the Remote Access Protocol (RAP), and much more. It is \
licensed under LGPL which means commercial organizations can \
legitimately use it with their proprietary code(you just can't sell or \
give away a modified binary only version of the library itself without \
reciprocation)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.19"

RPM_NAME = "jcifs-javadoc-1.3.19-5.9.noarch.rpm"
RPM_HASH = "fbe4733f95808a2a1f63a370edb5b12b5c07724357d120a4d1f18cb98e44a9cecb3bc3c5285830cd6d9bd616301c26750e00437e3edc240b9245d66a58b36807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
