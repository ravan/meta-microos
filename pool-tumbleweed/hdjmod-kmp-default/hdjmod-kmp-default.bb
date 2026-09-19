SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.39_k7.2.4_1"

RPM_NAME = "hdjmod-kmp-default-1.39_k7.2.4_1-1.6.aarch64.rpm"
RPM_HASH = "cfa479069cdaf1c4968a2706660129f8f8d50221616bda0d944cea9a62d623ae1ffd138b9bbae353a7a12f64184ecf611b5fdea41f670ba39c326904997a3fe7"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default-k7.2.4-1 \
kmod-hdj-mod.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---alloc-skb \
ksym-default---arch-copy-from-user \
ksym-default---arch-copy-to-user \
ksym-default---check-object-size \
ksym-default---fortify-panic \
ksym-default---init-swait-queue-head \
ksym-default---init-waitqueue-head \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-large-noprof \
ksym-default---kmalloc-noprof \
ksym-default---list-add-valid-or-report \
ksym-default---list-del-entry-valid-or-report \
ksym-default---netlink-kernel-create \
ksym-default---nlmsg-put \
ksym-default---stack-chk-fail \
ksym-default---tasklet-hi-schedule \
ksym-default---wake-up \
ksym-default---warn-printk \
ksym-default--printk \
ksym-default--raw-spin-lock \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-alt-cb-patch-nops \
ksym-default-autoremove-wake-function \
ksym-default-complete \
ksym-default-down \
ksym-default-dynamic-might-resched \
ksym-default-finish-wait \
ksym-default-get-device \
ksym-default-init-net \
ksym-default-init-wait-entry \
ksym-default-jiffies \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-kthread-create-on-node \
ksym-default-kthread-should-stop \
ksym-default-kthread-stop \
ksym-default-memcpy \
ksym-default-memset \
ksym-default-mod-timer \
ksym-default-module-layout \
ksym-default-msleep \
ksym-default-netlink-kernel-release \
ksym-default-netlink-unicast \
ksym-default-param-array-ops \
ksym-default-param-ops-charp \
ksym-default-param-ops-int \
ksym-default-prepare-to-wait-event \
ksym-default-put-device \
ksym-default-random-kmalloc-seed \
ksym-default-refcount-warn-saturate \
ksym-default-schedule \
ksym-default-schedule-timeout \
ksym-default-seq-printf \
ksym-default-sized-strscpy \
ksym-default-sk-skb-reason-drop \
ksym-default-snd-card-disconnect \
ksym-default-snd-card-free \
ksym-default-snd-card-free-when-closed \
ksym-default-snd-card-new \
ksym-default-snd-card-register \
ksym-default-snd-component-add \
ksym-default-snd-device-new \
ksym-default-snd-info-create-card-entry \
ksym-default-snd-info-get-line \
ksym-default-snd-rawmidi-new \
ksym-default-snd-rawmidi-receive \
ksym-default-snd-rawmidi-set-ops \
ksym-default-snd-rawmidi-transmit \
ksym-default-snd-rawmidi-transmit-ack \
ksym-default-snd-rawmidi-transmit-empty \
ksym-default-snprintf \
ksym-default-sprintf \
ksym-default-sscanf \
ksym-default-strnlen \
ksym-default-strstr \
ksym-default-tasklet-init \
ksym-default-tasklet-kill \
ksym-default-timer-delete-sync \
ksym-default-timer-init-key \
ksym-default-up \
ksym-default-usb-alloc-coherent \
ksym-default-usb-alloc-urb \
ksym-default-usb-autopm-get-interface \
ksym-default-usb-autopm-put-interface \
ksym-default-usb-clear-halt \
ksym-default-usb-deregister \
ksym-default-usb-deregister-dev \
ksym-default-usb-find-interface \
ksym-default-usb-free-coherent \
ksym-default-usb-free-urb \
ksym-default-usb-get-dev \
ksym-default-usb-get-intf \
ksym-default-usb-get-status \
ksym-default-usb-ifnum-to-if \
ksym-default-usb-kill-urb \
ksym-default-usb-put-dev \
ksym-default-usb-put-intf \
ksym-default-usb-register-dev \
ksym-default-usb-register-driver \
ksym-default-usb-set-interface \
ksym-default-usb-string \
ksym-default-usb-submit-urb \
ksym-default-validate-usercopy-range \
ksym-default-wait-for-completion \
ksym-default-wait-for-completion-interruptible \
ksym-default-wait-for-completion-interruptible-timeout \
ksym-default-wait-for-completion-timeout \
ksym-default-wake-up-process \
suse-kernel-rpm-scriptlets"

inherit rpm
