SUMMARY = "Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-onlyDVD-5.0-111.1.aarch64.rpm"
RPM_HASH = "ee63917a681e4f50e513d78184d2b4683374b1178a2684bed2d27577f884329f0ad6a6da05210872b7c61e247f0bf3887c4447a7137803133d2a72141cd6f757"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-onlyDVD"

RDEPENDS:${PN} += "ModemManager \
NetworkManager-wwan \
bcache-tools \
cryptsetup \
exfatprogs \
firewalld \
hyper-v \
iscsiuio \
lvm2 \
mokutil \
multipath-tools \
nvme-cli \
open-iscsi \
open-vm-tools \
pam-pwquality \
pattern- \
policycoreutils-python-utils \
qemu-guest-agent \
sdbootutil \
sdbootutil-snapper \
spice-vdagent \
systemd-boot \
systemd-zram-service \
tpm2.0-abrmd \
wpa-supplicant \
xfsprogs"

inherit rpm
