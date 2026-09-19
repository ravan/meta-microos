SUMMARY = "Development files for MIT Kerberos5 (openSUSE mini variant)"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes Libraries and \
Include Files for Development"
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-mini-devel-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "5884ea9388214319a29e327a0b24ca4162ed222b4168ab7f6e9347c5d5a8765368e5b1c84f0e834ecafcd4993ed98ae1e5e83d97cd75d81846c7b76718f28cb0"

RPROVIDES:${PN} += "krb5-devel \
krb5-mini-devel \
pkgconfig-gssrpc \
pkgconfig-kadm-client \
pkgconfig-kadm-server \
pkgconfig-kdb \
pkgconfig-krb5 \
pkgconfig-krb5-gssapi \
pkgconfig-mit-krb5 \
pkgconfig-mit-krb5-gssapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
krb5-mini \
pkgconfig-com-err \
pkgconfig-gssrpc \
pkgconfig-kdb \
pkgconfig-libverto \
pkgconfig-mit-krb5 \
pkgconfig-mit-krb5-gssapi \
pkgconfig-ss \
this-is-only-for-build-envs"

inherit rpm
