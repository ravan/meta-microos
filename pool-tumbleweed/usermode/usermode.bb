SUMMARY = "Tools for certain user account management tasks"
DESCRIPTION = "usermode contains the userhelper program, which can be used to allow configured \
programs to be run with superuser privileges by ordinary users, and several \
graphical tools for users: \
* userinfo allows users to change their finger information. usermount lets \
* users mount, unmount, and format filesystems. userpasswd allows users to \
  change their passwords."
LICENSE = "LGPL-2.0-or-later"

PV = "1.114"

RPM_NAME = "usermode-1.114-1.6.aarch64.rpm"
RPM_HASH = "2f626cdf6b6443d654b7028842df1d96c3fe1629e9a00a03e799ee5789eb6d4eac4bb51f717b4e640eb5a03e513d5c244eaad499eb82b535e5a00b566a44580c"

RPROVIDES:${PN} += "usermode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
libuser.so.1"

inherit rpm
