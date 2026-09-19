SUMMARY = "Development package for xmlrpc-c"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xmlrpc-c."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "xmlrpc-c-devel-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "48148f996a3e17093552da80316651fd104c2be273f7ab2c112cdb68a257eeb306395b7ab18ade24712d44ad999c89d0a23dcff50614b5766077f2a226b9b94c"

RPROVIDES:${PN} += "pkgconfig-xmlrpc \
pkgconfig-xmlrpc++ \
pkgconfig-xmlrpc-abyss \
pkgconfig-xmlrpc-abyss++ \
pkgconfig-xmlrpc-client \
pkgconfig-xmlrpc-client++ \
pkgconfig-xmlrpc-openssl \
pkgconfig-xmlrpc-server \
pkgconfig-xmlrpc-server++ \
pkgconfig-xmlrpc-server-abyss \
pkgconfig-xmlrpc-server-cgi \
pkgconfig-xmlrpc-server-pstream++ \
pkgconfig-xmlrpc-util \
pkgconfig-xmlrpc-util++ \
xmlrpc-c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libxmlrpc++9 \
libxmlrpc-abyss++9 \
libxmlrpc-abyss3 \
libxmlrpc-client++9 \
libxmlrpc-client3 \
libxmlrpc-cpp9 \
libxmlrpc-openssl1 \
libxmlrpc-packetsocket9 \
libxmlrpc-server++9 \
libxmlrpc-server-abyss++9 \
libxmlrpc-server-abyss3 \
libxmlrpc-server-cgi++9 \
libxmlrpc-server-cgi3 \
libxmlrpc-server-pstream++9 \
libxmlrpc-server3 \
libxmlrpc-util++9 \
libxmlrpc-util4 \
libxmlrpc3 \
pkgconfig-libxml-2.0 \
pkgconfig-xmlrpc \
pkgconfig-xmlrpc++ \
pkgconfig-xmlrpc-abyss \
pkgconfig-xmlrpc-client \
pkgconfig-xmlrpc-server \
pkgconfig-xmlrpc-server++ \
pkgconfig-xmlrpc-util \
pkgconfig-xmlrpc-util++"

inherit rpm
