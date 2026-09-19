SUMMARY = "Development files for claws-mail"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
This package contains header files for building plugins."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.0"

RPM_NAME = "claws-mail-devel-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "a558308fb6b6be750ead29b581b346fba74dba6ee0d82fbf05bc7a43ad40fb0129ff522c2cd19c4e435e85e078e7b5a8a038877a9615ade83e02e1c6bac95089"

RPROVIDES:${PN} += "claws-mail-/usr/include/claws-mail/main.h \
claws-mail-devel \
claws-mail-extra-plugins-devel \
pkgconfig-claws-mail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
claws-mail \
enchant-devel \
glib2-devel \
gnutls-devel \
gtk3-devel \
libcanberra-gtk3-devel \
libetpan-devel \
openldap2-devel \
pkgconfig-gpgme"

inherit rpm
