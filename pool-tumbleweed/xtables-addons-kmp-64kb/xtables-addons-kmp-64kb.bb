SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.31_k7.2.4_1"

RPM_NAME = "xtables-addons-kmp-64kb-3.31_k7.2.4_1-1.4.aarch64.rpm"
RPM_HASH = "88c3563b6e9402b1222b962d87315d0027667cbe14d19c8ee072addd4fda88fe9358b9a7717593f214a18b5f65aca59dae829dd6fa5c7b88d1fb33b0f8b7fb38"

RPROVIDES:${PN} += "kmod-xt-ACCOUNT.ko \
kmod-xt-CHAOS.ko \
kmod-xt-DELUDE.ko \
kmod-xt-DHCPMAC.ko \
kmod-xt-DNETMAP.ko \
kmod-xt-ECHO.ko \
kmod-xt-IPMARK.ko \
kmod-xt-LOGMARK.ko \
kmod-xt-PROTO.ko \
kmod-xt-SYSRQ.ko \
kmod-xt-TARPIT.ko \
kmod-xt-asn.ko \
kmod-xt-condition.ko \
kmod-xt-fuzzy.ko \
kmod-xt-geoip.ko \
kmod-xt-iface.ko \
kmod-xt-ipp2p.ko \
kmod-xt-ipv4options.ko \
kmod-xt-length2.ko \
kmod-xt-lscan.ko \
kmod-xt-pknock.ko \
kmod-xt-psd.ko \
kmod-xt-quota2.ko \
multiversion-kernel \
xtables-addons-kmp \
xtables-addons-kmp-64kb \
xtables-addons-kmp-64kb-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
ksym-64kb----ratelimit \
ksym-64kb---alloc-skb \
ksym-64kb---arch-copy-from-user \
ksym-64kb---arch-copy-to-user \
ksym-64kb---check-object-size \
ksym-64kb---dynamic-pr-debug \
ksym-64kb---fortify-panic \
ksym-64kb---get-random-u32-below \
ksym-64kb---ipv6-addr-type \
ksym-64kb---kmalloc-cache-noprof \
ksym-64kb---kmalloc-noprof \
ksym-64kb---list-add-valid-or-report \
ksym-64kb---list-del-entry-valid-or-report \
ksym-64kb---msecs-to-jiffies \
ksym-64kb---nf-ip6-route \
ksym-64kb---printk-ratelimit \
ksym-64kb---pskb-pull-tail \
ksym-64kb---rcu-read-lock \
ksym-64kb---rcu-read-unlock \
ksym-64kb---request-module \
ksym-64kb---seq-open-private \
ksym-64kb---stack-chk-fail \
ksym-64kb--printk \
ksym-64kb--raw-spin-lock \
ksym-64kb--raw-spin-lock-bh \
ksym-64kb--raw-spin-unlock \
ksym-64kb--raw-spin-unlock-bh \
ksym-64kb-add-timer \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-capable \
ksym-64kb-cn-netlink-send \
ksym-64kb-crypto-alloc-shash \
ksym-64kb-crypto-destroy-tfm \
ksym-64kb-crypto-shash-finup \
ksym-64kb-crypto-shash-init \
ksym-64kb-crypto-shash-setkey \
ksym-64kb-csum-ipv6-magic \
ksym-64kb-csum-partial \
ksym-64kb-csum-tcpudp-nofold \
ksym-64kb-dev-get-by-name \
ksym-64kb-down \
ksym-64kb-dst-release \
ksym-64kb-dump-stack \
ksym-64kb-dynamic-preempt-schedule-notrace \
ksym-64kb-free-pages \
ksym-64kb-get-free-pages-noprof \
ksym-64kb-get-random-bytes \
ksym-64kb-get-random-u32 \
ksym-64kb-get-random-u8 \
ksym-64kb-handle-sysrq \
ksym-64kb-in4-pton \
ksym-64kb-init-net \
ksym-64kb-init-user-ns \
ksym-64kb-ip-local-out \
ksym-64kb-ip-route-me-harder \
ksym-64kb-ip6-dst-hoplimit \
ksym-64kb-ip6-local-out \
ksym-64kb-ip6-route-output-flags \
ksym-64kb-ipv6-ext-hdr \
ksym-64kb-ipv6-find-hdr \
ksym-64kb-ipv6-skip-exthdr \
ksym-64kb-jiffies \
ksym-64kb-kfree \
ksym-64kb-kmalloc-caches \
ksym-64kb-ktime-get-real-seconds \
ksym-64kb-ktime-get-real-ts64 \
ksym-64kb-ktime-get-seconds \
ksym-64kb-l3mdev-master-ifindex-rcu \
ksym-64kb-make-kgid \
ksym-64kb-make-kuid \
ksym-64kb-memcmp \
ksym-64kb-memcpy \
ksym-64kb-memset \
ksym-64kb-module-layout \
ksym-64kb-module-put \
ksym-64kb-mutex-init-generic \
ksym-64kb-mutex-lock \
ksym-64kb-mutex-unlock \
ksym-64kb-net-ratelimit \
ksym-64kb-nf-conntrack-destroy \
ksym-64kb-nf-ct-attach \
ksym-64kb-nf-hook-slow \
ksym-64kb-nf-hooks-needed \
ksym-64kb-nf-ip-checksum \
ksym-64kb-nf-ip6-checksum \
ksym-64kb-nf-nat-setup-info \
ksym-64kb-nf-register-sockopt \
ksym-64kb-nf-unregister-sockopt \
ksym-64kb-param-ops-int \
ksym-64kb-param-ops-long \
ksym-64kb-param-ops-string \
ksym-64kb-param-ops-uint \
ksym-64kb-proc-create-data \
ksym-64kb-proc-mkdir \
ksym-64kb-proc-set-user \
ksym-64kb-random-kmalloc-seed \
ksym-64kb-rcuref-get-slowpath \
ksym-64kb-refcount-warn-saturate \
ksym-64kb-register-pernet-subsys \
ksym-64kb-remove-proc-entry \
ksym-64kb-remove-proc-subtree \
ksym-64kb-scnprintf \
ksym-64kb-security-skb-classify-flow \
ksym-64kb-seq-lseek \
ksym-64kb-seq-open \
ksym-64kb-seq-printf \
ksym-64kb-seq-read \
ksym-64kb-seq-release \
ksym-64kb-seq-release-private \
ksym-64kb-simple-strtoll \
ksym-64kb-simple-strtoull \
ksym-64kb-single-open \
ksym-64kb-single-release \
ksym-64kb-sized-strscpy \
ksym-64kb-sk-skb-reason-drop \
ksym-64kb-skb-copy-bits \
ksym-64kb-skb-copy-expand \
ksym-64kb-skb-ensure-writable \
ksym-64kb-skb-find-text \
ksym-64kb-skb-put \
ksym-64kb-skb-trim \
ksym-64kb-sprintf \
ksym-64kb-strchr \
ksym-64kb-strcmp \
ksym-64kb-strcspn \
ksym-64kb-strlen \
ksym-64kb-strncmp \
ksym-64kb-strnlen \
ksym-64kb-synchronize-rcu \
ksym-64kb-textsearch-destroy \
ksym-64kb-textsearch-prepare \
ksym-64kb-timer-delete \
ksym-64kb-timer-init-key \
ksym-64kb-unregister-pernet-subsys \
ksym-64kb-up \
ksym-64kb-validate-usercopy-range \
ksym-64kb-vfree \
ksym-64kb-vmalloc-noprof \
ksym-64kb-xfrm-lookup \
ksym-64kb-xt-check-proc-name \
ksym-64kb-xt-register-match \
ksym-64kb-xt-register-matches \
ksym-64kb-xt-register-target \
ksym-64kb-xt-register-targets \
ksym-64kb-xt-request-find-match \
ksym-64kb-xt-request-find-target \
ksym-64kb-xt-unregister-match \
ksym-64kb-xt-unregister-matches \
ksym-64kb-xt-unregister-target \
ksym-64kb-xt-unregister-targets \
suse-kernel-rpm-scriptlets"

inherit rpm
