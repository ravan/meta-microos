SUMMARY = "The original xpad kernel driver with support for Xbox One controllers removed"
DESCRIPTION = "This is the original xpad kernel driver with support for Xbox One \
controllers removed. If you are running the xone driver you will have \
to replace the xpad kernel module with this one to retain the \
functionality of Xbox and Xbox 360 controllers."
LICENSE = "GPL-2.0-or-later"

PV = "0+git20251029.8e90367_k7.2.4_1"

RPM_NAME = "xpad-noone-kmp-64kb-0+git20251029.8e90367_k7.2.4_1-1.30.aarch64.rpm"
RPM_HASH = "875103dd20a775dbe08f5bbf2c6c5f438888a0100a5827cb058aa2aebc09737e59a10179b23d90707c0398e37094124197f38de0608d15d16ff5ff5084a14caf"

RPROVIDES:${PN} += "kmod-xpad-noone.ko \
multiversion-kernel \
xpad-noone-kmp \
xpad-noone-kmp-64kb \
xpad-noone-kmp-64kb-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---dynamic-dev-dbg \
ksym-64kb---fortify-panic \
ksym-64kb---init-waitqueue-head \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---rcu-read-lock \
ksym-64kb---rcu-read-unlock \
ksym-64kb---stack-chk-fail \
ksym-64kb--dev-err \
ksym-64kb--dev-info \
ksym-64kb--dev-warn \
ksym-64kb--printk \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-delayed-work-timer-fn \
ksym-64kb-devm-kmalloc \
ksym-64kb-dump-stack \
ksym-64kb-flush-delayed-work \
ksym-64kb-flush-work \
ksym-64kb-ida-alloc-range \
ksym-64kb-ida-free \
ksym-64kb-input-allocate-device \
ksym-64kb-input-event \
ksym-64kb-input-ff-create-memless \
ksym-64kb-input-ff-destroy \
ksym-64kb-input-free-device \
ksym-64kb-input-register-device \
ksym-64kb-input-set-abs-params \
ksym-64kb-input-set-capability \
ksym-64kb-input-unregister-device \
ksym-64kb-jiffies \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-ktime-get-seconds \
ksym-64kb-led-classdev-register-ext \
ksym-64kb-led-classdev-unregister \
ksym-64kb-led-set-brightness \
ksym-64kb-memcpy \
ksym-64kb-memset \
ksym-64kb-mod-timer \
ksym-64kb-module-layout \
ksym-64kb-mutex-lock \
ksym-64kb-mutex-unlock \
ksym-64kb-param-ops-bool \
ksym-64kb-print-hex-dump \
ksym-64kb-queue-delayed-work-on \
ksym-64kb-queue-work-on \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-snprintf \
ksym-64kb-strcasecmp \
ksym-64kb-strnlen \
ksym-64kb-synchronize-rcu \
ksym-64kb-system-percpu-wq \
ksym-64kb-timer-delete-sync \
ksym-64kb-timer-init-key \
ksym-64kb-usb-alloc-coherent \
ksym-64kb-usb-alloc-urb \
ksym-64kb-usb-anchor-urb \
ksym-64kb-usb-control-msg \
ksym-64kb-usb-control-msg-recv \
ksym-64kb-usb-deregister \
ksym-64kb-usb-free-coherent \
ksym-64kb-usb-free-urb \
ksym-64kb-usb-ifnum-to-if \
ksym-64kb-usb-kill-anchored-urbs \
ksym-64kb-usb-kill-urb \
ksym-64kb-usb-register-driver \
ksym-64kb-usb-set-interface \
ksym-64kb-usb-submit-urb \
ksym-64kb-usb-unanchor-urb \
ksym-64kb-usb-wait-anchor-empty-timeout \
suse-kernel-rpm-scriptlets"

inherit rpm
