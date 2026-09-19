SUMMARY = "Leverage Docker credentials with libsecret"
DESCRIPTION = "Docker by default uses base64 to store the credentials for the different \
registries. This behavior can be changed by leveraging the credentials storage \
to this program, which uses libsecret in Linux."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "docker-credential-secretservice-0.9.8-1.1.aarch64.rpm"
RPM_HASH = "321ede87cf07f9c6a5a60e5482972af73253084ced8224cad551a04f8f31f1cb9eff37a9cc4007a9a5c741b326fe5505f3714eb046a368f3c638003fda2037cf"

RPROVIDES:${PN} += "config-docker-credential-secretservice \
docker-credential-secretservice"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
systemd"

inherit rpm
