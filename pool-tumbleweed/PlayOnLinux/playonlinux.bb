SUMMARY = "Play your Windows games on GNU/Linux"
DESCRIPTION = "PlayOnLinux is a piece of software which allows you to easily install and use \
numerous games and apps designed to run with Microsoft Windows. \
Few games are compatible with GNU/Linux at the moment and it certainly is \
a factor preventing the migration to this system. \
PlayOnLinux brings a cost-free, accessible and efficient solution to this problem."
LICENSE = "GPL-3.0-only"

PV = "4.4.0"

RPM_NAME = "PlayOnLinux-4.4.0-5.2.noarch.rpm"
RPM_HASH = "37c5decf415882db0cb86fdeb20a093dfe7653de4db0616e432ffac2de1e8faf530211dfe7eec96a96f668a8658089fdfbbcd15d141130937574d51db68f9bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PlayOnLinux"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ImageMagick \
gettext \
icoutils \
jq \
p7zip-full \
python3-base \
python3-natsort \
python3-wxPython \
unzip \
wget \
wine \
xterm"

inherit rpm
