SUMMARY = "Driver for Thrustmaster wheels"
DESCRIPTION = "Linux kernel module for Thrustmaster T300RS, T248, and (experimental support) TX and TS-XV wheels."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1+git0.d4c9e06_k7.2.4_1"

RPM_NAME = "hid-tmff2-kmp-default-0.0.1+git0.d4c9e06_k7.2.4_1-1.24.aarch64.rpm"
RPM_HASH = "a657cc444b99411fa27bcd9a58ea39b430f08667e15dac70dfa38ac6d6d46edc0995da8027c1c70c6bb88ef28da7d3ba3301aff852bed572e23410b5da322745"

RPROVIDES:${PN} += "hid-tmff2-kmp \
hid-tmff2-kmp-default \
hid-tmff2-kmp-default-k7.2.4-1 \
kmod-hid-tmff-new.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---hid-register-driver \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-noprof \
ksym-default---msecs-to-jiffies \
ksym-default---stack-chk-fail \
ksym-default--dev-err \
ksym-default--dev-info \
ksym-default--dev-warn \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-cancel-delayed-work-sync \
ksym-default-delayed-work-timer-fn \
ksym-default-device-create-file \
ksym-default-device-remove-file \
ksym-default-hid-hw-request \
ksym-default-hid-hw-start \
ksym-default-hid-hw-stop \
ksym-default-hid-open-report \
ksym-default-hid-unregister-driver \
ksym-default-input-ff-create \
ksym-default-input-ff-destroy \
ksym-default-jiffies \
ksym-default-kasprintf \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-kstrtouint \
ksym-default-memset \
ksym-default-module-layout \
ksym-default-param-ops-int \
ksym-default-queue-delayed-work-on \
ksym-default-random-kmalloc-seed \
ksym-default-scnprintf \
ksym-default-strlen \
ksym-default-strncmp \
ksym-default-system-percpu-wq \
ksym-default-timer-init-key \
ksym-default-usb-control-msg \
ksym-default-usb-interrupt-msg \
suse-kernel-rpm-scriptlets"

inherit rpm
