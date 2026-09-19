SUMMARY = "Applications for working with the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. FreeTDS includes call level interfaces for DB-Lib, CT-Lib, \
and ODBC. \
 \
This package provides application to allow users to make use of the protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "freetds-tools-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "f55f37031a05890eac6d72a1dcc2eab6367e0f44b2c6bf58143ab06ede18b3cfdc9a95f970f0e8ccce3d81a28f814a3e1f4c1f0be545e930af0d11453bf8de08"

RPROVIDES:${PN} += "freetds-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8 \
libodbc.so.2 \
libreadline.so.8 \
libsybdb.so.5"

inherit rpm
