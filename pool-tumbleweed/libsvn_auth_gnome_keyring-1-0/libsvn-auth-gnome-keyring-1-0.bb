SUMMARY = "GNOME keyring sypport for Subversion"
DESCRIPTION = "Provides GNOME keyring support for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "libsvn_auth_gnome_keyring-1-0-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "b4d512ee6c268c8e8a6a0facb9293687977a7d805428033a1b6382ada725fd0d3a77efddb2f03344c1f5ea15d87be47a72de2ea9eda30c3f145ef016c32ec59f"

RPROVIDES:${PN} += "libsvn-auth-gnome-keyring-1-0 \
libsvn-auth-gnome-keyring-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libapr-1.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
