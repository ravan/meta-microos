SUMMARY = "A Tool for Transferring Data from URLs"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, FTPS, \
TFTP, DICT, TELNET, LDAP, or FILE). The command is designed to work \
without user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "curl-8.22.0-1.1.aarch64.rpm"
RPM_HASH = "bd166772936450c94d8fc73c85f9c56659f4c7b619d32afe5ad9702bbdf62f855da51d91b1d58acfba14b7cb7c627ae0671f6cbcfd1c4a7a4cfa3a6a7a82cdb9"

RPROVIDES:${PN} += "curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libcurl4 \
libz.so.1"

inherit rpm
