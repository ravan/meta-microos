SUMMARY = "Kernel module for Looking Glass (IVSHMEM framebuffer sharing)"
DESCRIPTION = "This package provides the kvmfr kernel module used by Looking Glass for IVSHMEM frame sharing."
LICENSE = "GPL-2.0-only"

PV = "0~B7_k7.2.5_1"

RPM_NAME = "looking-glass-kvmfr-kmp-default-0~B7_k7.2.5_1-2.18.aarch64.rpm"
RPM_HASH = "6ca26ced97cbfa4afc077f66ef7fa36b0139ee507e1f3792e5bc7a3f293c3764b90d227b65b16eb9dfc844ee80faef31d0576e23f72c23396a208ec5b0ba3533"

RPROVIDES:${PN} += "kmod-kvmfr.ko \
looking-glass-kvmfr-kmp \
looking-glass-kvmfr-kmp-default \
looking-glass-kvmfr-kmp-default-k7.2.5-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---arch-copy-from-user \
ksym-default---fortify-panic \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-noprof \
ksym-default---pci-register-driver \
ksym-default---register-chrdev \
ksym-default---stack-chk-fail \
ksym-default---unregister-chrdev \
ksym-default--printk \
ksym-default-alt-cb-patch-nops \
ksym-default-class-create \
ksym-default-class-destroy \
ksym-default-device-create \
ksym-default-device-destroy \
ksym-default-devm-memremap-pages \
ksym-default-devm-memunmap-pages \
ksym-default-dma-buf-export \
ksym-default-dma-buf-fd \
ksym-default-dma-map-sg-attrs \
ksym-default-dma-unmap-sg-attrs \
ksym-default-idr-alloc \
ksym-default-idr-find \
ksym-default-idr-get-next \
ksym-default-idr-remove \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-memset \
ksym-default-module-layout \
ksym-default-mutex-lock \
ksym-default-mutex-unlock \
ksym-default-param-array-ops \
ksym-default-param-ops-int \
ksym-default-pci-disable-device \
ksym-default-pci-enable-device \
ksym-default-pci-release-regions \
ksym-default-pci-request-regions \
ksym-default-pci-unregister-driver \
ksym-default-random-kmalloc-seed \
ksym-default-remap-vmalloc-range \
ksym-default-sg-alloc-table-from-pages-segment \
ksym-default-sg-free-table \
ksym-default-vfree \
ksym-default-vmalloc-to-page \
ksym-default-vmalloc-user-noprof \
suse-kernel-rpm-scriptlets"

inherit rpm
