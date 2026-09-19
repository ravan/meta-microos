SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.31_k7.2.4_1"

RPM_NAME = "xtables-addons-kmp-default-3.31_k7.2.4_1-1.4.aarch64.rpm"
RPM_HASH = "cf9a12eb13a665af243a1b66742cb2de22a07099ec349e036c1c5d5a4a7d7d49d7665d618a8e007a8e53ad61fed1392bbfbf6c41d51cc90979cab3fc0fed8eba"

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
xtables-addons-kmp-default \
xtables-addons-kmp-default-k7.2.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
ksym-default----ratelimit \
ksym-default---alloc-skb \
ksym-default---arch-copy-from-user \
ksym-default---arch-copy-to-user \
ksym-default---check-object-size \
ksym-default---dynamic-pr-debug \
ksym-default---fortify-panic \
ksym-default---get-random-u32-below \
ksym-default---ipv6-addr-type \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-noprof \
ksym-default---list-add-valid-or-report \
ksym-default---list-del-entry-valid-or-report \
ksym-default---msecs-to-jiffies \
ksym-default---nf-ip6-route \
ksym-default---printk-ratelimit \
ksym-default---pskb-pull-tail \
ksym-default---rcu-read-lock \
ksym-default---rcu-read-unlock \
ksym-default---request-module \
ksym-default---seq-open-private \
ksym-default---stack-chk-fail \
ksym-default--printk \
ksym-default--raw-spin-lock \
ksym-default--raw-spin-lock-bh \
ksym-default--raw-spin-unlock \
ksym-default--raw-spin-unlock-bh \
ksym-default-add-timer \
ksym-default-alt-cb-patch-nops \
ksym-default-capable \
ksym-default-cn-netlink-send \
ksym-default-crypto-alloc-shash \
ksym-default-crypto-destroy-tfm \
ksym-default-crypto-shash-finup \
ksym-default-crypto-shash-init \
ksym-default-crypto-shash-setkey \
ksym-default-csum-ipv6-magic \
ksym-default-csum-partial \
ksym-default-csum-tcpudp-nofold \
ksym-default-dev-get-by-name \
ksym-default-down \
ksym-default-dst-release \
ksym-default-dump-stack \
ksym-default-dynamic-preempt-schedule-notrace \
ksym-default-free-pages \
ksym-default-get-free-pages-noprof \
ksym-default-get-random-bytes \
ksym-default-get-random-u32 \
ksym-default-get-random-u8 \
ksym-default-handle-sysrq \
ksym-default-in4-pton \
ksym-default-init-net \
ksym-default-init-user-ns \
ksym-default-ip-local-out \
ksym-default-ip-route-me-harder \
ksym-default-ip6-dst-hoplimit \
ksym-default-ip6-local-out \
ksym-default-ip6-route-output-flags \
ksym-default-ipv6-ext-hdr \
ksym-default-ipv6-find-hdr \
ksym-default-ipv6-skip-exthdr \
ksym-default-jiffies \
ksym-default-kfree \
ksym-default-kmalloc-caches \
ksym-default-ktime-get-real-seconds \
ksym-default-ktime-get-real-ts64 \
ksym-default-ktime-get-seconds \
ksym-default-l3mdev-master-ifindex-rcu \
ksym-default-make-kgid \
ksym-default-make-kuid \
ksym-default-memcmp \
ksym-default-memcpy \
ksym-default-memset \
ksym-default-module-layout \
ksym-default-module-put \
ksym-default-mutex-init-generic \
ksym-default-mutex-lock \
ksym-default-mutex-unlock \
ksym-default-net-ratelimit \
ksym-default-nf-conntrack-destroy \
ksym-default-nf-ct-attach \
ksym-default-nf-hook-slow \
ksym-default-nf-hooks-needed \
ksym-default-nf-ip-checksum \
ksym-default-nf-ip6-checksum \
ksym-default-nf-nat-setup-info \
ksym-default-nf-register-sockopt \
ksym-default-nf-unregister-sockopt \
ksym-default-param-ops-int \
ksym-default-param-ops-long \
ksym-default-param-ops-string \
ksym-default-param-ops-uint \
ksym-default-proc-create-data \
ksym-default-proc-mkdir \
ksym-default-proc-set-user \
ksym-default-random-kmalloc-seed \
ksym-default-rcuref-get-slowpath \
ksym-default-refcount-warn-saturate \
ksym-default-register-pernet-subsys \
ksym-default-remove-proc-entry \
ksym-default-remove-proc-subtree \
ksym-default-scnprintf \
ksym-default-security-skb-classify-flow \
ksym-default-seq-lseek \
ksym-default-seq-open \
ksym-default-seq-printf \
ksym-default-seq-read \
ksym-default-seq-release \
ksym-default-seq-release-private \
ksym-default-simple-strtoll \
ksym-default-simple-strtoull \
ksym-default-single-open \
ksym-default-single-release \
ksym-default-sized-strscpy \
ksym-default-sk-skb-reason-drop \
ksym-default-skb-copy-bits \
ksym-default-skb-copy-expand \
ksym-default-skb-ensure-writable \
ksym-default-skb-find-text \
ksym-default-skb-put \
ksym-default-skb-trim \
ksym-default-sprintf \
ksym-default-strchr \
ksym-default-strcmp \
ksym-default-strcspn \
ksym-default-strlen \
ksym-default-strncmp \
ksym-default-strnlen \
ksym-default-synchronize-rcu \
ksym-default-textsearch-destroy \
ksym-default-textsearch-prepare \
ksym-default-timer-delete \
ksym-default-timer-init-key \
ksym-default-unregister-pernet-subsys \
ksym-default-up \
ksym-default-validate-usercopy-range \
ksym-default-vfree \
ksym-default-vmalloc-noprof \
ksym-default-xfrm-lookup \
ksym-default-xt-check-proc-name \
ksym-default-xt-register-match \
ksym-default-xt-register-matches \
ksym-default-xt-register-target \
ksym-default-xt-register-targets \
ksym-default-xt-request-find-match \
ksym-default-xt-request-find-target \
ksym-default-xt-unregister-match \
ksym-default-xt-unregister-matches \
ksym-default-xt-unregister-target \
ksym-default-xt-unregister-targets \
suse-kernel-rpm-scriptlets"

inherit rpm
