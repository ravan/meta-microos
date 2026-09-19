SUMMARY = "Development files shared by Samba subpackages"
DESCRIPTION = "This package contains the libraries and header files needed to \
develop programs which make use of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-devel-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "64df6b1f549d8f71c3db6d406be0ad4e105defa4f89f51279ade49f23e5ea88a61bd9ab9055f37fa280b484df4dd62ab6df86808c1bf97f1812557918d4cb5e2"

RPROVIDES:${PN} += "libdcerpc-devel \
libdcerpc-samr-devel \
libndr-devel \
libndr-krb5pac-devel \
libndr-nbt-devel \
libndr-standard-devel \
libnetapi-devel \
libsamba-credentials-devel \
libsamba-errors-devel \
libsamba-hostconfig-devel \
libsamba-passdb-devel \
libsamba-policy-devel \
libsamba-util-devel \
libsamdb-devel \
libsmbclient-devel \
libsmbconf-devel \
libsmbldap-devel \
libtevent-util-devel \
libwbclient-devel \
libwbclient0-devel \
pkgconfig-dcerpc \
pkgconfig-dcerpc-samr \
pkgconfig-dcerpc-server \
pkgconfig-ndr \
pkgconfig-ndr-krb5pac \
pkgconfig-ndr-nbt \
pkgconfig-ndr-standard \
pkgconfig-netapi \
pkgconfig-samba-credentials \
pkgconfig-samba-hostconfig \
pkgconfig-samba-policy \
pkgconfig-samba-util \
pkgconfig-samdb \
pkgconfig-smbclient \
pkgconfig-wbclient \
samba-core-devel \
samba-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-dcerpc \
pkgconfig-krb5 \
pkgconfig-ldb \
pkgconfig-ndr \
pkgconfig-ndr-standard \
pkgconfig-samba-util \
pkgconfig-talloc \
pkgconfig-tevent \
samba-ad-dc-libs \
samba-client-libs \
samba-libs \
samba-winbind-libs"

inherit rpm
