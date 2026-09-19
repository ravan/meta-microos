SUMMARY = "PAM module to authenticate against a separate database"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains pam_userdb which is used to verify a \
username/password pair against values stored in a Berkeley DB database."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-userdb-1.7.2+git48-1.1.aarch64.rpm"
RPM_HASH = "f47b520a5bacc2787f9704a754c5304ffd454bc647ad6cc09eda46884c4fa4b6fb36f5ae88ce92d0705954421a108691a6ef611d2c961352f2efc849ed784be5"

RPROVIDES:${PN} += "pam-extra-/usr/lib64/security/pam-userdb.so \
pam-userdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libpam.so.0"

inherit rpm
