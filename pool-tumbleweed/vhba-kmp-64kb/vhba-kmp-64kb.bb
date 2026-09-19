SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20260313_k7.2.4_1"

RPM_NAME = "vhba-kmp-64kb-20260313_k7.2.4_1-1.23.aarch64.rpm"
RPM_HASH = "e706f8858b4b904834c1fb652f5eb45f16fc32aec9631b2b187f3e5d9253c7fd626639c0ce4bdfefdd32e4ccdc0d917399ee2e454642e5fbfc12d722c581c01d"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---arch-copy-from-user \
ksym-64kb---arch-copy-to-user \
ksym-64kb---check-object-size \
ksym-64kb---dynamic-dev-dbg \
ksym-64kb---dynamic-pr-debug \
ksym-64kb---init-waitqueue-head \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmalloc-noprof \
ksym-64kb---list-add-valid-or-report \
ksym-64kb---list-del-entry-valid-or-report \
ksym-64kb---platform-driver-register \
ksym-64kb---stack-chk-fail \
ksym-64kb---wake-up \
ksym-64kb--dev-warn \
ksym-64kb--find-first-bit \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-autoremove-wake-function \
ksym-64kb-dump-stack \
ksym-64kb-dynamic-preempt-schedule \
ksym-64kb-finish-wait \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-memcpy \
ksym-64kb-memset \
ksym-64kb-misc-deregister \
ksym-64kb-misc-register \
ksym-64kb-module-layout \
ksym-64kb-param-ops-int \
ksym-64kb-platform-device-register \
ksym-64kb-platform-device-unregister \
ksym-64kb-platform-driver-unregister \
ksym-64kb-prepare-to-wait \
ksym-64kb-queue-work-on \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-schedule \
ksym-64kb-schedule-timeout \
ksym-64kb-scsi-add-device \
ksym-64kb-scsi-add-host-with-dma \
ksym-64kb-scsi-device-lookup \
ksym-64kb-scsi-device-put \
ksym-64kb-scsi-done \
ksym-64kb-scsi-host-alloc \
ksym-64kb-scsi-host-put \
ksym-64kb-scsi-remove-device \
ksym-64kb-scsi-remove-host \
ksym-64kb-system-percpu-wq \
ksym-64kb-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
