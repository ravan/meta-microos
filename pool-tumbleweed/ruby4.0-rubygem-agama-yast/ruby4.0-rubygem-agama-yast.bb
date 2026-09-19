SUMMARY = "YaST integration service for Agama"
DESCRIPTION = "D-Bus service exposing some YaST features that are useful for Agama."
LICENSE = "GPL-2.0-only"

PV = "24"

RPM_NAME = "ruby4.0-rubygem-agama-yast-24-1.1.aarch64.rpm"
RPM_HASH = "71d6fbfd2f031eb280cee4040aa55e1041a284b84c2e59d3bbbdf46a6d913c305457c8541f9dab4cbdca06f04ce5ed719df2d9b9f9c32e3d9add46f70ace1a15"

RPROVIDES:${PN} += "ruby4.0-rubygem-agama-yast \
rubygem-agama-yast \
rubygem-ruby-4.0.0-agama-yast \
rubygem-ruby-4.0.0-agama-yast-24"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
autoyast2-installation \
bcache-tools \
btrfsprogs \
cryptsetup \
dbus-1-common \
dbus-1-daemon \
dosfstools \
e2fsprogs \
exfatprogs \
fcoe-utils \
fde-tools \
jfsutils \
libstorage-ng-lang \
lvm2 \
mdadm \
multipath-tools \
nfs-client \
ntfs-3g \
ntfsprogs \
nvme-cli \
open-iscsi \
quota \
ruby-abi \
rubygem-ruby-4.0.0-cfa-1.0 \
rubygem-ruby-4.0.0-cfa-grub2-2.0 \
rubygem-ruby-4.0.0-cheetah-1.0 \
rubygem-ruby-4.0.0-csv-3 \
rubygem-ruby-4.0.0-eventmachine-1.2 \
rubygem-ruby-4.0.0-fast-gettext-2.3 \
rubygem-ruby-4.0.0-logger-1 \
rubygem-ruby-4.0.0-nokogiri-1 \
rubygem-ruby-4.0.0-ostruct-0.6 \
rubygem-ruby-4.0.0-prime-0 \
rubygem-ruby-4.0.0-rexml-3 \
rubygem-ruby-4.0.0-ruby-dbus \
snapper \
udftools \
util-linux-systemd \
xfsprogs \
yast2 \
yast2-bootloader \
yast2-country \
yast2-hardware-detection \
yast2-installation \
yast2-iscsi-client \
yast2-network \
yast2-proxy \
yast2-schema \
yast2-storage-ng"

inherit rpm
