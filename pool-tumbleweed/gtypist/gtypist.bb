SUMMARY = "Universal typing tutor"
DESCRIPTION = "GNU Typist (typist) is a universal typing tutor. You can learn \
correct typing and improve your skills by practising its exercises on \
a regular basis. Its main features are: \
 \
* It comes with several typing tutorials: in Czech, English (Qwerty, \
  Dvorak and Colemak keyboards), Russian and Spanish, as well as \
  simpler exercises in German, French and Norwegian. \
 \
* It interprets a simple and intuitive scripting language that \
  describes typing tutorials. You can easily modify existing \
  tutorials or create new ones according to your needs. \
 \
* Users can navigate through lessons through an easy to use arrow key \
  based menu interface. 'vi' up, down, left and right keys can be \
  used too."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.1"

RPM_NAME = "gtypist-2.10.1-1.5.aarch64.rpm"
RPM_HASH = "1a1667aca41b9f89887fd511185df0a2f1962c9ddeda56292f4e331abb3619b131f522d58548212f598582c7502aa517196adc2f38943f0560754535f7675e8e"

RPROVIDES:${PN} += "gtypist"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
