SUMMARY = "GSSAPI Module for Apache"
DESCRIPTION = "This module has been built as a replacement for the aging \
mod_auth_kerb. Its aim is to use only GSSAPI calls and be \
as much as possible agnostic of the actual mechanism used."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "apache2-mod_auth_gssapi-1.6.5-3.6.aarch64.rpm"
RPM_HASH = "b464a0e8b7cfbb9e2f5f1ab570d4528377d89db1fa9bf3789c2eda33351028b5f2f1de764b02243cbf545a683d6320293ff6569d3afce25d92c9fb239fff3a6d"

RPROVIDES:${PN} += "apache2-mod-auth-gssapi"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
suse-maintenance-mmn-0"

inherit rpm
