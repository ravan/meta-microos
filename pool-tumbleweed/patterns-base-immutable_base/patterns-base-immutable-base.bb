SUMMARY = "Immutable Base System"
DESCRIPTION = "This is the base system for a host updated by Transactional Updates. Includes Tools for systems with a read-only root filesystem."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-immutable_base-20241218-34.1.aarch64.rpm"
RPM_HASH = "45863bcc5857d92ebd69910c13ea78b026f85cfc4aeaca077c13b812e6ed90ecbfcfc87c1d6916d5994ed297d6bd633689dc01d28904b44823f45f3e3175eb64"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-immutable-base \
patterns-base-transactional-base"

RDEPENDS:${PN} += "/usr/bin/gzip \
MicroOS-release \
btrfsmaintenance \
dosfstools \
kdump \
less \
libtss2-tcti-device0 \
microos-tools \
openssh \
pattern- \
read-only-root-fs \
rebootmgr \
sudo \
systemd-presets-branding-MicroOS \
tpm2-0-tss \
tpm2.0-tools \
transactional-update \
transactional-update-zypp-config \
zypp-boot-plugin"

inherit rpm
