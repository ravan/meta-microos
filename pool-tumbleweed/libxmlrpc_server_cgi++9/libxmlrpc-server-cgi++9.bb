SUMMARY = "XMLRPC interface for CGI programs"
DESCRIPTION = "This library contains the xmlrpc_c::server_cgi class, used to contain \
the guts of a CGI-based XML-RPC server. It runs inside a CGI script \
and gets the XML-RPC call from, and delivers the XML-RPC response to, \
the CGI environment."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server_cgi++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "0cacb58c02d57311cf752858b44f5d3845227ca2d93d93474cc584cb6bf6eefa2c9772aae4b58a1999e86e0e9b93ba0c3a79d48936db6f6db9bc9d2184223086"

RPROVIDES:${PN} += "libxmlrpc-server-cgi++.so.9 \
libxmlrpc-server-cgi++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.9 \
libxmlrpc-server++.so.9 \
libxmlrpc-util++.so.9 \
libxmlrpc.so.3"

inherit rpm
