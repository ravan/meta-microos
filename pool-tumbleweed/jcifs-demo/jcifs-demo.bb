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

RPM_NAME = "jcifs-demo-1.3.19-5.9.noarch.rpm"
RPM_HASH = "f5c8070f030b2244b52ecc7a51791458cdddfbfcffa1d06c856b0a786f64ba44648e14530fc0f15eff2d560094d4bdd8e544332e16b957715c21ac994cae7410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcifs-demo"

RDEPENDS:${PN} += "jcifs"

inherit rpm
