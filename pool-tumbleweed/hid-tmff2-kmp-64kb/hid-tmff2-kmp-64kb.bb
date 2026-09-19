SUMMARY = "Driver for Thrustmaster wheels"
DESCRIPTION = "Linux kernel module for Thrustmaster T300RS, T248, and (experimental support) TX and TS-XV wheels."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1+git0.d4c9e06_k7.2.4_1"

RPM_NAME = "hid-tmff2-kmp-64kb-0.0.1+git0.d4c9e06_k7.2.4_1-1.24.aarch64.rpm"
RPM_HASH = "9cfb77a9208a388fc682fbdb702514dc9aa906c16fbd7076f1f2ecf74113ae4efec7702a4db2267a0234f6f84eeebbd857fa6899279027d133c7bc6b9b3f91f7"

RPROVIDES:${PN} += "hid-tmff2-kmp \
hid-tmff2-kmp-64kb \
hid-tmff2-kmp-64kb-k7.2.4-1 \
kmod-hid-tmff-new.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---hid-register-driver \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmalloc-noprof \
ksym-64kb---msecs-to-jiffies \
ksym-64kb---stack-chk-fail \
ksym-64kb--dev-err \
ksym-64kb--dev-info \
ksym-64kb--dev-warn \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-cancel-delayed-work-sync \
ksym-64kb-delayed-work-timer-fn \
ksym-64kb-device-create-file \
ksym-64kb-device-remove-file \
ksym-64kb-hid-hw-request \
ksym-64kb-hid-hw-start \
ksym-64kb-hid-hw-stop \
ksym-64kb-hid-open-report \
ksym-64kb-hid-unregister-driver \
ksym-64kb-input-ff-create \
ksym-64kb-input-ff-destroy \
ksym-64kb-jiffies \
ksym-64kb-kasprintf \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-kstrtouint \
ksym-64kb-memset \
ksym-64kb-module-layout \
ksym-64kb-param-ops-int \
ksym-64kb-queue-delayed-work-on \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-scnprintf \
ksym-64kb-strlen \
ksym-64kb-strncmp \
ksym-64kb-system-percpu-wq \
ksym-64kb-timer-init-key \
ksym-64kb-usb-control-msg \
ksym-64kb-usb-interrupt-msg \
suse-kernel-rpm-scriptlets"

inherit rpm
