SUMMARY = "Virtual Tape Library kernel module"
DESCRIPTION = "This is the kernel module package for the mhvtl Virtual Tape & \
Library package. \
 \
This works in conjunction with the user-land commands and libraries \
to enable tape emulation. \
 \
The vtl module is a stripped-down derivative of the scsi_debug kernel \
module, plus a character device 'back end' to pass the SCSI commands \
through to user-space daemons."
LICENSE = "GPL-2.0-only"

PV = "1.72_release+13.928fc784016a_k7.2.4_1"

RPM_NAME = "mhvtl-kmp-64kb-1.72_release+13.928fc784016a_k7.2.4_1-1.40.aarch64.rpm"
RPM_HASH = "3d61db0807f96b7d70638b00634fd569154ec6ca15cd4732605b4b712022ab50e18e0c841732e4bbdb15498b618d8c43ac375495b4cf3119bdc85aa0b7a7ecea"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb-k7.2.4-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---arch-copy-from-user \
ksym-64kb---arch-copy-to-user \
ksym-64kb---check-object-size \
ksym-64kb---dynamic-pr-debug \
ksym-64kb---fortify-panic \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmem-cache-create-args \
ksym-64kb---list-add-valid-or-report \
ksym-64kb---list-del-entry-valid-or-report \
ksym-64kb---register-chrdev \
ksym-64kb---scsi-add-device \
ksym-64kb---stack-chk-fail \
ksym-64kb---unregister-chrdev \
ksym-64kb---warn-printk \
ksym-64kb--printk \
ksym-64kb--raw-spin-lock \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-add-timer \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-bus-register \
ksym-64kb-bus-unregister \
ksym-64kb-dev-set-name \
ksym-64kb-device-register \
ksym-64kb-device-unregister \
ksym-64kb-down \
ksym-64kb-driver-create-file \
ksym-64kb-driver-register \
ksym-64kb-driver-remove-file \
ksym-64kb-driver-unregister \
ksym-64kb-dump-stack \
ksym-64kb-flush-dcache-page \
ksym-64kb-jiffies \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-kmem-cache-alloc-noprof \
ksym-64kb-kmem-cache-destroy \
ksym-64kb-kmem-cache-free \
ksym-64kb-memcpy \
ksym-64kb-memset \
ksym-64kb-module-layout \
ksym-64kb-mutex-lock \
ksym-64kb-mutex-unlock \
ksym-64kb-param-ops-int \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-scsi-add-host-with-dma \
ksym-64kb-scsi-change-queue-depth \
ksym-64kb-scsi-device-put \
ksym-64kb-scsi-done \
ksym-64kb-scsi-host-alloc \
ksym-64kb-scsi-host-put \
ksym-64kb-scsi-remove-device \
ksym-64kb-scsi-remove-host \
ksym-64kb-scsi-scan-host \
ksym-64kb-sg-copy-from-buffer \
ksym-64kb-sg-miter-next \
ksym-64kb-sg-miter-start \
ksym-64kb-sg-miter-stop \
ksym-64kb-sprintf \
ksym-64kb-sscanf \
ksym-64kb-strncasecmp \
ksym-64kb-sysfs-emit \
ksym-64kb-timer-delete-sync \
ksym-64kb-timer-init-key \
ksym-64kb-up \
ksym-64kb-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
