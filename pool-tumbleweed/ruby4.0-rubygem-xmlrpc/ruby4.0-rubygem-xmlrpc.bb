SUMMARY = "XMLRPC is a lightweight protocol that enables remote procedure calls"
DESCRIPTION = "XMLRPC is a lightweight protocol that enables remote procedure calls over \
HTTP."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.3.3"

RPM_NAME = "ruby4.0-rubygem-xmlrpc-0.3.3-1.15.aarch64.rpm"
RPM_HASH = "60780fe7296ce1911f7bbe7d23299b5ec5f065ee0d024f9f45a4c376052e9964dc9b4e10a43638881e4986a559a8b4f8392ce01981a982a8eb5b9c76bd073660"

RPROVIDES:${PN} += "ruby4.0-rubygem-xmlrpc \
rubygem-ruby-4.0.0-xmlrpc \
rubygem-ruby-4.0.0-xmlrpc-0 \
rubygem-ruby-4.0.0-xmlrpc-0.3 \
rubygem-ruby-4.0.0-xmlrpc-0.3.3 \
rubygem-xmlrpc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-webrick"

inherit rpm
