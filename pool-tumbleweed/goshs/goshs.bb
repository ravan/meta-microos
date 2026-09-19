SUMMARY = "A simple HTTP server"
DESCRIPTION = "goshs is a replacement for Python's SimpleHTTPServer. \
It allows uploading and downloading via HTTP/S with either \
self-signed certificate or user provided certificate and \
you can use HTTP basic auth."
LICENSE = "MIT"

PV = "2.1.6"

RPM_NAME = "goshs-2.1.6-1.1.aarch64.rpm"
RPM_HASH = "3e67e42ae5dc8c87885da270770b47563747202f40fe7e2077d30a54617d4f02f7b48d210adff5e38d7e28ce909b91fb558de89e01c7e7cbb8dbc88154898518"

RPROVIDES:${PN} += "goshs"

RDEPENDS:${PN} += ""

inherit rpm
