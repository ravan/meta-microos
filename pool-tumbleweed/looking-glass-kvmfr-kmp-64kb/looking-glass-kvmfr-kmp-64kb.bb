SUMMARY = "Kernel module for Looking Glass (IVSHMEM framebuffer sharing)"
DESCRIPTION = "This package provides the kvmfr kernel module used by Looking Glass for IVSHMEM frame sharing."
LICENSE = "GPL-2.0-only"

PV = "0~B7_k7.2.5_1"

RPM_NAME = "looking-glass-kvmfr-kmp-64kb-0~B7_k7.2.5_1-2.18.aarch64.rpm"
RPM_HASH = "96c34e09c155c1b465f9142d91ac9e80b8615d9f99775f5c12947a31d5541d614800d0452679911b5f6e75699951d412cec8fd5857768afc6fc5515e04867c46"

RPROVIDES:${PN} += "kmod-kvmfr.ko \
looking-glass-kvmfr-kmp \
looking-glass-kvmfr-kmp-64kb \
looking-glass-kvmfr-kmp-64kb-k7.2.5-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---arch-copy-from-user \
ksym-64kb---fortify-panic \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmalloc-noprof \
ksym-64kb---pci-register-driver \
ksym-64kb---register-chrdev \
ksym-64kb---stack-chk-fail \
ksym-64kb---unregister-chrdev \
ksym-64kb--printk \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-class-create \
ksym-64kb-class-destroy \
ksym-64kb-device-create \
ksym-64kb-device-destroy \
ksym-64kb-devm-memremap-pages \
ksym-64kb-devm-memunmap-pages \
ksym-64kb-dma-buf-export \
ksym-64kb-dma-buf-fd \
ksym-64kb-dma-map-sg-attrs \
ksym-64kb-dma-unmap-sg-attrs \
ksym-64kb-idr-alloc \
ksym-64kb-idr-find \
ksym-64kb-idr-get-next \
ksym-64kb-idr-remove \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-memset \
ksym-64kb-module-layout \
ksym-64kb-mutex-lock \
ksym-64kb-mutex-unlock \
ksym-64kb-param-array-ops \
ksym-64kb-param-ops-int \
ksym-64kb-pci-disable-device \
ksym-64kb-pci-enable-device \
ksym-64kb-pci-release-regions \
ksym-64kb-pci-request-regions \
ksym-64kb-pci-unregister-driver \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-remap-vmalloc-range \
ksym-64kb-sg-alloc-table-from-pages-segment \
ksym-64kb-sg-free-table \
ksym-64kb-vfree \
ksym-64kb-vmalloc-to-page \
ksym-64kb-vmalloc-user-noprof \
suse-kernel-rpm-scriptlets"

inherit rpm
