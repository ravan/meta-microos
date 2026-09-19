SUMMARY = "Web Server Hosting ASP.NET"
DESCRIPTION = "The XSP server is a Web server that hosts the Mono System.Web \
classes for running what is commonly known as ASP.NET."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "xsp-4.7.1-2.11.aarch64.rpm"
RPM_HASH = "1152f74879470aca40c4e808adff7e2709188ca359ddb590d75819ec72c9ebedb5a4bc12601ecb3e258763be367186a1ffd6d6bac4b2592f5173c95ecc80f1c2"

RPROVIDES:${PN} += "config-xsp \
mono-Mono.WebServer2 \
mono-ServiceClient \
mono-asp-state4 \
mono-codebehind1 \
mono-dbpage-test-setup \
mono-dbsessmgr4 \
mono-extensions \
mono-fastcgi-mono-server4 \
mono-mod-mono-server4 \
mono-mono-fpm \
mono-tabcontrol \
mono-tabcontrol2 \
mono-treeview \
mono-typedesc \
mono-xsp4 \
pkgconfig-xsp-2 \
pkgconfig-xsp-4 \
xsp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
group-www \
libc.so.6 \
libfpm-helper0 \
mono-Mono.Data.Sqlite \
mono-Mono.Posix \
mono-Mono.Security \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Web \
mono-System.Web.Services \
mono-System.Xml \
mono-mscorlib \
user-wwwrun"

inherit rpm
