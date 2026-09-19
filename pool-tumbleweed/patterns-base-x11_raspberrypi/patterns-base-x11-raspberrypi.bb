SUMMARY = "X Window System (Raspberry Pi)"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-x11_raspberrypi-20241218-34.1.aarch64.rpm"
RPM_HASH = "f4b733f08aaf8563f88d9ebfe8f09dc9e8e419d9f79752aca74d2a4e49829c37981d43b3e4ebbda3f7375f5d622b58d76dbff92a1010005387f85002ff0e6c37"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-x11-raspberrypi"

RDEPENDS:${PN} += "gtk2-metatheme-adwaita \
gtk3-metatheme-adwaita \
icewm \
icewm-default \
icewm-lite \
icewm-theme-branding \
libyui-ncurses-pkg \
libyui-qt-pkg \
mutt \
mutt-lang \
pattern- \
polkit-default-privs \
polkit-gnome-lang \
x11-tools \
x11perf \
xauth \
xbacklight \
xclock \
xconsole \
xcursor-themes \
xcursorgen \
xdg-user-dirs \
xdg-user-dirs-gtk \
xdg-user-dirs-gtk-lang \
xdg-utils \
xdm \
xdmbgrd \
xdpyinfo \
xev \
xeyes \
xf86-input-evdev \
xf86-input-libinput \
xfd \
xfontsel \
xgamma \
xhost \
xinit \
xinput \
xkbcomp \
xkbevd \
xkbprint \
xkbutils \
xkeyboard-config \
xkill \
xlogo \
xlsatoms \
xlsclients \
xlsfonts \
xmag \
xmessage \
xmodmap \
xorg-x11 \
xorg-x11-fonts-core \
xorg-x11-server \
xorg-x11-server-extra \
xprop \
xrandr \
xrdb \
xrestop \
xscope \
xscreensaver \
xscreensaver-data \
xset \
xsetroot \
xterm \
xtermset \
xvinfo \
xwd \
xwininfo \
yast2-control-center-qt \
yast2-packager \
yast2-snapper \
yast2-x11"

inherit rpm
