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

RPM_NAME = "crash-kmp-64kb-9.0.2_k7.2.4_1-1.6.aarch64.rpm"
RPM_HASH = "583d98eb9f14d0635a3e53e67c430e294b42aa31c7d63f9e837611fb032daa8bffb2b4d322f691e61f4261ad440c33230a4a591da7d38f4e85a31ae2546cdc17"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-64kb \
crash-kmp-64kb-k7.2.4-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb---arch-copy-to-user \
ksym-64kb---check-object-size \
ksym-64kb--printk \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-capable \
ksym-64kb-copy-from-kernel-nofault \
ksym-64kb-dynamic-might-resched \
ksym-64kb-dynamic-preempt-schedule \
ksym-64kb-free-pages \
ksym-64kb-get-free-pages-noprof \
ksym-64kb-kimage-voffset \
ksym-64kb-mem-section \
ksym-64kb-memstart-addr \
ksym-64kb-misc-deregister \
ksym-64kb-misc-register \
ksym-64kb-module-layout \
ksym-64kb-validate-usercopy-range \
suse-kernel-rpm-scriptlets"

inherit rpm
