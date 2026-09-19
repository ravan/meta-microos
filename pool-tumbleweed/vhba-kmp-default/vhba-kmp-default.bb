SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20260313_k7.2.4_1"

RPM_NAME = "vhba-kmp-default-20260313_k7.2.4_1-1.23.aarch64.rpm"
RPM_HASH = "8250d51b26fd0a362c52d0a29ac6ab7e6100353457610c4d4099435f6256a54b87908a51117e56c92c224a5095394d6118dd164e91bb16b8394214cad79efce6"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---arch-copy-from-user \
ksym-default---arch-copy-to-user \
ksym-default---check-object-size \
ksym-default---dynamic-dev-dbg \
ksym-default---dynamic-pr-debug \
ksym-default---init-waitqueue-head \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-noprof \
ksym-default---list-add-valid-or-report \
ksym-default---list-del-entry-valid-or-report \
ksym-default---platform-driver-register \
ksym-default---stack-chk-fail \
ksym-default---wake-up \
ksym-default--dev-warn \
ksym-default--find-first-bit \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-alt-cb-patch-nops \
ksym-default-autoremove-wake-function \
ksym-default-dump-stack \
ksym-default-dynamic-preempt-schedule \
ksym-default-finish-wait \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-memcpy \
ksym-default-memset \
ksym-default-misc-deregister \
ksym-default-misc-register \
ksym-default-module-layout \
ksym-default-param-ops-int \
ksym-default-platform-device-register \
ksym-default-platform-device-unregister \
ksym-default-platform-driver-unregister \
ksym-default-prepare-to-wait \
ksym-default-queue-work-on \
ksym-default-random-kmalloc-seed \
ksym-default-schedule \
ksym-default-schedule-timeout \
ksym-default-scsi-add-device \
ksym-default-scsi-add-host-with-dma \
ksym-default-scsi-device-lookup \
ksym-default-scsi-device-put \
ksym-default-scsi-done \
ksym-default-scsi-host-alloc \
ksym-default-scsi-host-put \
ksym-default-scsi-remove-device \
ksym-default-scsi-remove-host \
ksym-default-system-percpu-wq \
ksym-default-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
