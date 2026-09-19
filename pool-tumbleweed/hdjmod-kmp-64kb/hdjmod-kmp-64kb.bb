SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.39_k7.2.4_1"

RPM_NAME = "hdjmod-kmp-64kb-1.39_k7.2.4_1-1.6.aarch64.rpm"
RPM_HASH = "09207387eb3056ab2e3b0b925d1e08eff5ed9f54d98e2c5b17c2dc0c1098c3e0ab7c2e461bc9fda4de9eb497ccfb9d2292eef26e3eec766c2632b95128047e92"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-64kb \
hdjmod-kmp-64kb-k7.2.4-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---alloc-skb \
ksym-64kb---arch-copy-from-user \
ksym-64kb---arch-copy-to-user \
ksym-64kb---check-object-size \
ksym-64kb---fortify-panic \
ksym-64kb---init-swait-queue-head \
ksym-64kb---init-waitqueue-head \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmalloc-noprof \
ksym-64kb---list-add-valid-or-report \
ksym-64kb---list-del-entry-valid-or-report \
ksym-64kb---netlink-kernel-create \
ksym-64kb---nlmsg-put \
ksym-64kb---stack-chk-fail \
ksym-64kb---tasklet-hi-schedule \
ksym-64kb---wake-up \
ksym-64kb---warn-printk \
ksym-64kb--printk \
ksym-64kb--raw-spin-lock \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-autoremove-wake-function \
ksym-64kb-complete \
ksym-64kb-down \
ksym-64kb-dynamic-might-resched \
ksym-64kb-finish-wait \
ksym-64kb-get-device \
ksym-64kb-init-net \
ksym-64kb-init-wait-entry \
ksym-64kb-jiffies \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-kthread-create-on-node \
ksym-64kb-kthread-should-stop \
ksym-64kb-kthread-stop \
ksym-64kb-memcpy \
ksym-64kb-memset \
ksym-64kb-mod-timer \
ksym-64kb-module-layout \
ksym-64kb-msleep \
ksym-64kb-netlink-kernel-release \
ksym-64kb-netlink-unicast \
ksym-64kb-param-array-ops \
ksym-64kb-param-ops-charp \
ksym-64kb-param-ops-int \
ksym-64kb-prepare-to-wait-event \
ksym-64kb-put-device \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-refcount-warn-saturate \
ksym-64kb-schedule \
ksym-64kb-schedule-timeout \
ksym-64kb-seq-printf \
ksym-64kb-sized-strscpy \
ksym-64kb-sk-skb-reason-drop \
ksym-64kb-snd-card-disconnect \
ksym-64kb-snd-card-free \
ksym-64kb-snd-card-free-when-closed \
ksym-64kb-snd-card-new \
ksym-64kb-snd-card-register \
ksym-64kb-snd-component-add \
ksym-64kb-snd-device-new \
ksym-64kb-snd-info-create-card-entry \
ksym-64kb-snd-info-get-line \
ksym-64kb-snd-rawmidi-new \
ksym-64kb-snd-rawmidi-receive \
ksym-64kb-snd-rawmidi-set-ops \
ksym-64kb-snd-rawmidi-transmit \
ksym-64kb-snd-rawmidi-transmit-ack \
ksym-64kb-snd-rawmidi-transmit-empty \
ksym-64kb-snprintf \
ksym-64kb-sprintf \
ksym-64kb-sscanf \
ksym-64kb-strnlen \
ksym-64kb-strstr \
ksym-64kb-tasklet-init \
ksym-64kb-tasklet-kill \
ksym-64kb-timer-delete-sync \
ksym-64kb-timer-init-key \
ksym-64kb-up \
ksym-64kb-usb-alloc-coherent \
ksym-64kb-usb-alloc-urb \
ksym-64kb-usb-autopm-get-interface \
ksym-64kb-usb-autopm-put-interface \
ksym-64kb-usb-clear-halt \
ksym-64kb-usb-deregister \
ksym-64kb-usb-deregister-dev \
ksym-64kb-usb-find-interface \
ksym-64kb-usb-free-coherent \
ksym-64kb-usb-free-urb \
ksym-64kb-usb-get-dev \
ksym-64kb-usb-get-intf \
ksym-64kb-usb-get-status \
ksym-64kb-usb-ifnum-to-if \
ksym-64kb-usb-kill-urb \
ksym-64kb-usb-put-dev \
ksym-64kb-usb-put-intf \
ksym-64kb-usb-register-dev \
ksym-64kb-usb-register-driver \
ksym-64kb-usb-set-interface \
ksym-64kb-usb-string \
ksym-64kb-usb-submit-urb \
ksym-64kb-validate-usercopy-range \
ksym-64kb-wait-for-completion \
ksym-64kb-wait-for-completion-interruptible \
ksym-64kb-wait-for-completion-interruptible-timeout \
ksym-64kb-wait-for-completion-timeout \
ksym-64kb-wake-up-process \
suse-kernel-rpm-scriptlets"

inherit rpm
