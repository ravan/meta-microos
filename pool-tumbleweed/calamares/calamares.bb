SUMMARY = "Installer from a live CD/DVD/USB to disk"
DESCRIPTION = "Calamares is a distribution-independent installer framework, designed to install \
from a live CD/DVD/USB environment to a hard disk. It includes a graphical \
installation program based on Qt. Calamares can replace YaST2 Live Installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.2"

RPM_NAME = "calamares-3.4.2-1.1.aarch64.rpm"
RPM_HASH = "e3159210babd2f8522f4af231001a2849ca8182345f0d63ac0357500ecbddda9d5959bdfbaedb3a4812d147280496a16e0713f64a8393bba52dfee99b827170d"

RPROVIDES:${PN} += "calamares \
calamares-libs3 \
libcalamares-job-contextualprocess.so \
libcalamares-job-dracutlukscfg.so \
libcalamares-job-dummycpp.so \
libcalamares-job-fsresizer.so \
libcalamares-job-hostinfo.so \
libcalamares-job-initcpio.so \
libcalamares-job-initramfs.so \
libcalamares-job-luksbootkeyfile.so \
libcalamares-job-luksopenswaphookcfg.so \
libcalamares-job-machineid.so \
libcalamares-job-preservefiles.so \
libcalamares-job-removeuser.so \
libcalamares-job-shellprocess.so \
libcalamares-job-umount.so \
libcalamares-job-unpackfsc.so \
libcalamares-job-zfs.so \
libcalamares-viewmodule-finished.so \
libcalamares-viewmodule-finishedq.so \
libcalamares-viewmodule-interactiveterminal.so \
libcalamares-viewmodule-keyboard.so \
libcalamares-viewmodule-keyboardq.so \
libcalamares-viewmodule-license.so \
libcalamares-viewmodule-locale.so \
libcalamares-viewmodule-localeq.so \
libcalamares-viewmodule-netinstall.so \
libcalamares-viewmodule-notesqml.so \
libcalamares-viewmodule-oemid.so \
libcalamares-viewmodule-packagechooser.so \
libcalamares-viewmodule-packagechooserq.so \
libcalamares-viewmodule-partition.so \
libcalamares-viewmodule-summary.so \
libcalamares-viewmodule-summaryq.so \
libcalamares-viewmodule-tracking.so \
libcalamares-viewmodule-users.so \
libcalamares-viewmodule-usersq.so \
libcalamares-viewmodule-welcome.so \
libcalamares-viewmodule-welcomeq.so \
libcalamares.so.3.4 \
libcalamaresui.so.3.4"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
NetworkManager \
calamares-branding \
console-setup \
coreutils \
dmidecode \
dosfstools \
dracut \
e2fsprogs \
efibootmgr \
gawk \
gptfdisk \
grub2 \
kde-cli-tools6 \
kpmcore \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6Parts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libkpmcore.so.13 \
libm.so.6 \
libparted.so.2 \
libpwquality.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.9 \
ntfsprogs \
os-prober \
parted \
polkit \
python3 \
rsync \
shadow \
squashfs \
systemd \
upower \
util-linux \
xdg-utils \
xkbutils \
zypper"

inherit rpm
