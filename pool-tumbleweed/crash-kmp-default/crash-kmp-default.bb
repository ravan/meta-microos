SUMMARY = "Crash utility for live systems; netdump, diskdump, LKCD or mcore dumpfiles"
DESCRIPTION = "The core analysis suite is a self-contained tool that can be used to \
investigate either live systems, kernel core dumps created from the \
netdump and diskdump packages from Red Hat Linux, the mcore kernel \
patch offered by Mission Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "9.0.2_k7.2.4_1"

RPM_NAME = "crash-kmp-default-9.0.2_k7.2.4_1-1.6.aarch64.rpm"
RPM_HASH = "98a72fd9b2810bf6b3e30d96f2aaabd9e28522d078cbcee8f560df2b6c04c98c283b4c3069c600f74a421b8c52df263f860307afd8da3da04aae419e9c524be1"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k7.2.4-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---arch-copy-to-user \
ksym-default---check-object-size \
ksym-default--printk \
ksym-default-alt-cb-patch-nops \
ksym-default-capable \
ksym-default-copy-from-kernel-nofault \
ksym-default-dynamic-might-resched \
ksym-default-dynamic-preempt-schedule \
ksym-default-free-pages \
ksym-default-get-free-pages-noprof \
ksym-default-kimage-voffset \
ksym-default-mem-section \
ksym-default-memstart-addr \
ksym-default-misc-deregister \
ksym-default-misc-register \
ksym-default-module-layout \
ksym-default-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
