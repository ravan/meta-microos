SUMMARY = "PAM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for PAM authentication."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-pam-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "cb930f2cbe72e02d4dabc1cd2a5fda95e56e37ad439d55cc864154cfa130dad765e7be339f8a73bb83b3871991156d9c600f9c0c86edadeb65d3f32cbd6020ca"

RPROVIDES:${PN} += "uwsgi-pam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
uwsgi"

inherit rpm
