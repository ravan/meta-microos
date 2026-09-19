SUMMARY = "Development files for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes Libraries and \
Include Files for Development"
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-devel-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "c97e7d5045c1c757c5815dbeaabac624e69150e8ec94da350dfba314e38038945dee209520ab5aaff5c406d1a8c16b8e194050c0bd5c3f20eab5536bd09d34a2"

RPROVIDES:${PN} += "krb5-devel \
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
keyutils-devel \
krb5 \
pkgconfig-com-err \
pkgconfig-gssrpc \
pkgconfig-kdb \
pkgconfig-libverto \
pkgconfig-mit-krb5 \
pkgconfig-mit-krb5-gssapi \
pkgconfig-ss"

inherit rpm
