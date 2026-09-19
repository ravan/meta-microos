SUMMARY = "HTTP server toolkit"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a \
proxy server, and a virtual-host server."
LICENSE = "BSD-2-Clause & Ruby"

PV = "1.9.2"

RPM_NAME = "ruby4.0-rubygem-webrick-1.9.2-1.6.aarch64.rpm"
RPM_HASH = "b3449d4e516a20ee0388e0afef278d519bd0dbef41303ab9a149b04d8b808f4aa7ca62bfb75e9785010e1296a5df4a376a059fa91b9bb91f91851cfa92784d50"

RPROVIDES:${PN} += "ruby4.0-rubygem-webrick \
rubygem-ruby-4.0.0-webrick \
rubygem-ruby-4.0.0-webrick-1 \
rubygem-ruby-4.0.0-webrick-1.9 \
rubygem-ruby-4.0.0-webrick-1.9.2 \
rubygem-webrick"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
