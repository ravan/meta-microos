SUMMARY = "The openSUSEway desktop environment meta package"
DESCRIPTION = "This meta-package aggregates openSUSEway desktop environment packages."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "openSUSEway-0.17.0-1.4.noarch.rpm"
RPM_HASH = "bec25e407f1a042d0bc8c48511bf84bd589385a5a6130a7d8944bbbfc7c3ff0df03643eaef8521398042adbf9dd1d6f5804b67cbb8b44b34ab4f0c32c172e549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openSUSEway \
openSUSEway"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
aaa-base \
adobe-sourcecodepro-fonts \
adobe-sourcesanspro-fonts \
adobe-sourceserifpro-fonts \
adwaita-icon-theme \
bzip2 \
cantarell-fonts \
clipman \
command-not-found \
curl \
dejavu-fonts \
ghostscript-fonts-other \
ghostscript-fonts-std \
git \
glibc-locale \
google-carlito-fonts \
google-droid-fonts \
google-opensans-fonts \
google-roboto-fonts \
greetd-branding-openSUSE \
grep \
gtk3-metatheme-adwaita \
gzip \
jq \
less \
metatheme-adwaita-common \
mpris-ctl \
noto-coloremoji-fonts \
noto-emoji-fonts \
noto-sans-fonts \
pipewire \
sudo \
sway-branding-openSUSE \
sway-marker \
tar \
waybar-branding-openSUSE \
wget \
wl-clipboard \
xdg-desktop-portal \
xdg-desktop-portal-gtk \
xdg-desktop-portal-wlr \
xdg-utils"

inherit rpm
