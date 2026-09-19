SUMMARY = "XSLT Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for rendering XML content using XSLT."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-xslt-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "6eddb8b8038fc06c6a7da31100c97b5119fa2263a43115790979064dec3d549794d2df102b39ab43ed1516cdc1a643cb0bf5275fdc03c376f601854f625ddea7"

RPROVIDES:${PN} += "uwsgi-xslt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxslt.so.1 \
uwsgi"

inherit rpm
