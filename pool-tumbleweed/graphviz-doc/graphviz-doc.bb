SUMMARY = "Documentation for graphviz"
DESCRIPTION = "Provides some additional PDF and HTML documentation for graphviz."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-doc-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "344531ebcbbaf727646dbacc8db576558156c8d2c49e9a90497f81d041279b803a7e9bed8fc380331e7ebc5e6ca620ec9924fdbfea93b312ed7e6cf852beb8e5"

RPROVIDES:${PN} += "graphviz-doc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/lua \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/tclsh"

inherit rpm
