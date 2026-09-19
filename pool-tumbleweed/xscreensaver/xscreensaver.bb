SUMMARY = "A screen saver and locker for the X Window System"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
The xscreensaver package consists of two parts: the screensaver and \
the 'driver' or 'daemon', which detects idleness and does locking, \
and the many graphics demos that are launched by xscreensaver. \
 \
Any X program that can draw on the root window can be used with \
xscreensaver, regardless of how that program is written, what \
language it is written in, or what libraries it uses. The \
xscreensaver daemon takes care of detecting when the user is idle, \
locking, and checking passwords and all the other book-keeping. All \
the other programs need to do is draw. \
 \
The benefit that xscreensaver has over the combination of the xlock \
and xautolock programs is the ease with which new graphic hacks can \
be installed. You do not need to recompile (or even re-run) the \
xscreensaver program to add a new display mode, you just change a \
config file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.15"

RPM_NAME = "xscreensaver-6.15-3.3.aarch64.rpm"
RPM_HASH = "9c0b153ecfab03c01b72028b04f51dc6ba2a4923b15052e0f986c8fca9ba8faa5029e7a0d73f79689c1aa17cdcb3966d2a6d9571850bff8a2fc9a82824ceb1c7"

RPROVIDES:${PN} += "config-xscreensaver \
font--lang=aa \
font--lang=af \
font--lang=agr \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=ayc \
font--lang=be \
font--lang=bem \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
font--lang=da \
font--lang=de \
font--lang=dsb \
font--lang=el \
font--lang=en \
font--lang=eo \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kum \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=lij \
font--lang=lt \
font--lang=lv \
font--lang=mfe \
font--lang=mg \
font--lang=mh \
font--lang=mhr \
font--lang=mjw \
font--lang=mk \
font--lang=mo \
font--lang=ms \
font--lang=mt \
font--lang=na \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nhn \
font--lang=niu \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sel \
font--lang=sg \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=smn \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=szl \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tpi \
font--lang=tr \
font--lang=ts \
font--lang=uk \
font--lang=unm \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wae \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yuw \
font--lang=za \
font--lang=zu \
font-classicconsole \
font-gallant12x22 \
font-luximono \
font-ocra \
font-specialelite \
xscreensaver \
xscreensaver-gnome \
xscrns"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
desktop-data \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXt.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcrypt.so.1 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxml2.so.16 \
xscreensaver-data"

inherit rpm
