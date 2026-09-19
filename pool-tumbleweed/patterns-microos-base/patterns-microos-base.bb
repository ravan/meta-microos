SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-5.0-111.1.aarch64.rpm"
RPM_HASH = "2a69a1ee4b1b72b8fbfd78353bdef47b79b36b611fccce14970c308d0a517680b1fa70a14fa824579f7d47a7e97a217645d75d494cee592df69b894ffa90d508"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base"

RDEPENDS:${PN} += "/usr/bin/gzip \
/usr/bin/hostname \
MicroOS-release \
NetworkManager \
NetworkManager-bluetooth \
NetworkManager-wifi \
aaa-base \
bash \
branding-openSUSE \
btrfsmaintenance \
btrfsprogs \
build-key \
busybox \
ca-certificates \
ca-certificates-mozilla \
chrony \
coreutils \
coreutils-systemd \
curl \
dosfstools \
glibc \
glibc-locale-base \
group-nobody \
health-checker \
health-checker-plugins-MicroOS \
iproute2 \
iputils \
kdump \
lastlog2 \
less \
libnss-usrfiles2 \
libtss2-tcti-device0 \
microos-tools \
openssh \
pam \
pam-config \
pattern- \
procps \
read-only-root-fs \
rebootmgr \
rpm \
shadow \
snapper \
sudo \
sysextmgr \
systemd \
systemd-presets-branding-MicroOS \
terminfo-base \
timezone \
tpm2-0-tss \
tpm2.0-tools \
user-nobody \
util-linux \
vim-small \
wtmpdb \
yast2-logs"

inherit rpm
