SUMMARY = "Common packages for Desktops on MicroOS"
DESCRIPTION = "Packages required for openSUSE MicroOS Desktops."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-common-5.0-111.1.aarch64.rpm"
RPM_HASH = "776ad20cacba022808ab11a20b8c6d08d65f102257910bc9ae080dca746ff73cb32ba8ece452cf67303e8ad1d29a49088eba7c064f8fa6e5e558084756bcb47f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-desktop-common"

RDEPENDS:${PN} += "OpenPrintingPPDs \
avahi \
bash-completion \
bluez-cups \
bluez-firmware \
bolt \
cups \
cups-filters \
cups-pk-helper \
ghostscript \
glibc-locale \
gstreamer-plugin-pipewire \
gzip \
hicolor-icon-theme-branding-openSUSE \
hostname \
hplip-hpijs \
kernel-firmware-all \
ntfs-3g \
ntfsprogs \
pattern- \
pipewire-alsa \
pipewire-pulseaudio \
policycoreutils-python-utils \
polkit-default-privs \
sof-firmware \
system-config-printer-common \
system-config-printer-dbus-service \
systemd-icon-branding-openSUSE \
transactional-update-notifier \
udev-configure-printer \
udisks2 \
unzip \
upower \
wget \
xdg-desktop-portal-gtk \
xdg-utils"

inherit rpm
