SUMMARY = "MicroOS KDE Plasma Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS with KDE Plasma"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-kde-5.0-111.1.aarch64.rpm"
RPM_HASH = "ffd78b1dd0327e9203d7407950157b7e94805f35661945a2e54034bada3f07260aaf743d8d8031e3fec9e6ae2b0c17460fbf451962da9001bfbe08f039748b96"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-desktop-kde"

RDEPENDS:${PN} += "Mesa-demo-egl \
NetworkManager-openvpn \
adobe-sourcecodepro-fonts \
adobe-sourcesans3-fonts \
adobe-sourcesanspro-fonts \
adobe-sourceserifpro-fonts \
adwaita-fonts \
bluedevil6 \
breeze6-wallpapers \
cantarell-fonts \
dejavu-fonts \
discover6-backend-flatpak \
discover6-backend-fwupd \
discover6-notifier \
dolphin \
falkon-kde \
ffmpegthumbs \
flatpak-kcm6 \
ghostscript-fonts-std \
google-carlito-fonts \
google-noto-coloremoji-fonts \
google-noto-sans-cjk-fonts \
google-noto-sans-symbols-fonts \
google-noto-sans-symbols2-fonts \
google-opensans-fonts \
google-roboto-fonts \
gvfs \
gvfs-backends \
hack-fonts \
ibm-plex-mono-fonts \
kaccounts-integration \
kaccounts-providers \
kate \
kde-gtk-config6 \
kde-gtk-config6-gtk3 \
kde-print-manager \
kdegraphics-thumbnailers \
kdenetwork-filesharing \
kdeplasma6-addons \
kf6-baloo-file \
kf6-purpose \
kf6-qqc2-desktop-style \
kgamma6 \
kio-extras \
kio-fuse \
kio-gdrive \
konsole \
ksshaskpass6 \
kwalletmanager \
liberation-fonts \
libqt5-qtimageformats \
openvpn-auth-pam-plugin \
oxygen5-sounds \
partitionmanager \
pattern- \
phonon-vlc-qt6 \
pinentry-qt6 \
plasma-branding-Kalpa \
plasma6-browser-integration \
plasma6-desktop-emojier \
plasma6-nm \
plasma6-nm-openconnect \
plasma6-nm-openvpn \
plasma6-pa \
plasma6-sddm-theme-openSUSE \
plasma6-session \
plasma6-systemmonitor \
sddm-kcm6 \
sddm-qt6 \
spectacle \
steam-devices \
suse-fonts \
urw-base35-fonts \
xdg-desktop-portal-kde"

inherit rpm
