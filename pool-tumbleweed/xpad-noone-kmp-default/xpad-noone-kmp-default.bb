SUMMARY = "The original xpad kernel driver with support for Xbox One controllers removed"
DESCRIPTION = "This is the original xpad kernel driver with support for Xbox One \
controllers removed. If you are running the xone driver you will have \
to replace the xpad kernel module with this one to retain the \
functionality of Xbox and Xbox 360 controllers."
LICENSE = "GPL-2.0-or-later"

PV = "0+git20251029.8e90367_k7.2.4_1"

RPM_NAME = "xpad-noone-kmp-default-0+git20251029.8e90367_k7.2.4_1-1.30.aarch64.rpm"
RPM_HASH = "297ba0db269edbcc725022528461a48f7925675c5026044700495ec53df85f12cf07cd28acef1e75ff29d39dab9d05e7bc2f29728917f59e81a9237a8064434f"

RPROVIDES:${PN} += "kmod-xpad-noone.ko \
multiversion-kernel \
xpad-noone-kmp \
xpad-noone-kmp-default \
xpad-noone-kmp-default-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---dynamic-dev-dbg \
ksym-default---fortify-panic \
ksym-default---init-waitqueue-head \
ksym-default---kmalloc-cache-noprof \
ksym-default---rcu-read-lock \
ksym-default---rcu-read-unlock \
ksym-default---stack-chk-fail \
ksym-default--dev-err \
ksym-default--dev-info \
ksym-default--dev-warn \
ksym-default--printk \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-delayed-work-timer-fn \
ksym-default-devm-kmalloc \
ksym-default-dump-stack \
ksym-default-flush-delayed-work \
ksym-default-flush-work \
ksym-default-ida-alloc-range \
ksym-default-ida-free \
ksym-default-input-allocate-device \
ksym-default-input-event \
ksym-default-input-ff-create-memless \
ksym-default-input-ff-destroy \
ksym-default-input-free-device \
ksym-default-input-register-device \
ksym-default-input-set-abs-params \
ksym-default-input-set-capability \
ksym-default-input-unregister-device \
ksym-default-jiffies \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-ktime-get-seconds \
ksym-default-led-classdev-register-ext \
ksym-default-led-classdev-unregister \
ksym-default-led-set-brightness \
ksym-default-memcpy \
ksym-default-memset \
ksym-default-mod-timer \
ksym-default-module-layout \
ksym-default-mutex-lock \
ksym-default-mutex-unlock \
ksym-default-param-ops-bool \
ksym-default-print-hex-dump \
ksym-default-queue-delayed-work-on \
ksym-default-queue-work-on \
ksym-default-random-kmalloc-seed \
ksym-default-snprintf \
ksym-default-strcasecmp \
ksym-default-strnlen \
ksym-default-synchronize-rcu \
ksym-default-system-percpu-wq \
ksym-default-timer-delete-sync \
ksym-default-timer-init-key \
ksym-default-usb-alloc-coherent \
ksym-default-usb-alloc-urb \
ksym-default-usb-anchor-urb \
ksym-default-usb-control-msg \
ksym-default-usb-control-msg-recv \
ksym-default-usb-deregister \
ksym-default-usb-free-coherent \
ksym-default-usb-free-urb \
ksym-default-usb-ifnum-to-if \
ksym-default-usb-kill-anchored-urbs \
ksym-default-usb-kill-urb \
ksym-default-usb-register-driver \
ksym-default-usb-set-interface \
ksym-default-usb-submit-urb \
ksym-default-usb-unanchor-urb \
ksym-default-usb-wait-anchor-empty-timeout \
suse-kernel-rpm-scriptlets"

inherit rpm
