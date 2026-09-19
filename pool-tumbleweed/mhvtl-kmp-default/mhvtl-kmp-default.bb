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

RPM_NAME = "mhvtl-kmp-default-1.72_release+13.928fc784016a_k7.2.4_1-1.40.aarch64.rpm"
RPM_HASH = "19785cdf69b622be29e39206846068cb040f216c54f2bdc2c152046db0cffb727a90fb8e57aa3e95d0d4279aaa4b90d1806722191e10f69acfb280b4a61eff67"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k7.2.4-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---arch-copy-from-user \
ksym-default---arch-copy-to-user \
ksym-default---check-object-size \
ksym-default---dynamic-pr-debug \
ksym-default---fortify-panic \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmem-cache-create-args \
ksym-default---list-add-valid-or-report \
ksym-default---list-del-entry-valid-or-report \
ksym-default---register-chrdev \
ksym-default---scsi-add-device \
ksym-default---stack-chk-fail \
ksym-default---unregister-chrdev \
ksym-default---warn-printk \
ksym-default--printk \
ksym-default--raw-spin-lock \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-add-timer \
ksym-default-alt-cb-patch-nops \
ksym-default-bus-register \
ksym-default-bus-unregister \
ksym-default-dev-set-name \
ksym-default-device-register \
ksym-default-device-unregister \
ksym-default-down \
ksym-default-driver-create-file \
ksym-default-driver-register \
ksym-default-driver-remove-file \
ksym-default-driver-unregister \
ksym-default-dump-stack \
ksym-default-flush-dcache-page \
ksym-default-jiffies \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-kmem-cache-alloc-noprof \
ksym-default-kmem-cache-destroy \
ksym-default-kmem-cache-free \
ksym-default-memcpy \
ksym-default-memset \
ksym-default-module-layout \
ksym-default-mutex-lock \
ksym-default-mutex-unlock \
ksym-default-param-ops-int \
ksym-default-random-kmalloc-seed \
ksym-default-scsi-add-host-with-dma \
ksym-default-scsi-change-queue-depth \
ksym-default-scsi-device-put \
ksym-default-scsi-done \
ksym-default-scsi-host-alloc \
ksym-default-scsi-host-put \
ksym-default-scsi-remove-device \
ksym-default-scsi-remove-host \
ksym-default-scsi-scan-host \
ksym-default-sg-copy-from-buffer \
ksym-default-sg-miter-next \
ksym-default-sg-miter-start \
ksym-default-sg-miter-stop \
ksym-default-sprintf \
ksym-default-sscanf \
ksym-default-strncasecmp \
ksym-default-sysfs-emit \
ksym-default-timer-delete-sync \
ksym-default-timer-init-key \
ksym-default-up \
ksym-default-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
