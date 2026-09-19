SUMMARY = "A configurable email client"
DESCRIPTION = "Claws Mail (previously known as Sylpheed-Claws) is a \
configurable email client and news reader based on the GTK+ GUI \
toolkit, and it runs on the X Window System. \
 \
When claws-mail is executed for the first time, a configuration 'wizard' \
(dialog) will appear prompting you for the minimum information necessary to \
create a new account."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0"

RPM_NAME = "claws-mail-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "d871ce0ddfc50b20abde95c791b4ba99972f1ab800c54a12c3f2b1e6777dca54b0748dd2452e27394d047c1bd1f0a2593fd7fa0d0a25c0bcd33881a04a3d959c"

RPROVIDES:${PN} += "claws-mail \
claws-mail-extra-plugins \
claws-mail-extra-plugins-lang \
config-claws-mail \
libravatar.so \
sylpheed-claws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libarchive.so.13 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcompface.so.1 \
libcurl.so.4 \
libenchant-2.so.2 \
libetpan \
libetpan.so.26 \
libexpat.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libical.so.3 \
liblber.so.2 \
libldap.so.2 \
libnettle.so.8 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libperl.so \
libpoppler-glib.so.8 \
libpython3.13.so.1.0 \
librsvg-2.so.2 \
libstartup-notification-1.so.0 \
libwebkit2gtk-4.1.so.0 \
libz.so.1 \
perl \
pinentry-dialog \
python3-gobject"

inherit rpm
