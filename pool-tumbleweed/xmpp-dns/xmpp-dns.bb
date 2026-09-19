SUMMARY = "A CLI tool to check XMPP SRV records"
DESCRIPTION = "A CLI tool to check XMPP SRV records."
LICENSE = "BSD-2-Clause"

PV = "0.6.4"

RPM_NAME = "xmpp-dns-0.6.4-1.1.aarch64.rpm"
RPM_HASH = "5759367d3b0a246082e724d529ab83f0da7a483026c664272976f7bd9a0a085b50a140f72c2590d55198a3cd4dbeab87f572f3b20418675bcf3c13195cbc270e"

RPROVIDES:${PN} += "xmpp-dns"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
