SUMMARY = "CPU monitoring software for 64-bit processors"
DESCRIPTION = "CPU monitoring software with BIOS like functionalities designed for \
64-bit processors of architecture Intel Atom, Core2, Nehalem, SandyBridge and superiors; \
AMD Families from 0Fh ... up to 17h (Zen , Zen+ , Zen 2), 18h (Hygon Dhyana), \
19h (Zen 3, Zen 3+, Zen 4, Zen 4c), 1Ah (Zen 5, Zen 5c); \
Arm A64; RISC-V RV64; PowerPC64 (LE)"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4_k7.2.5_1"

RPM_NAME = "CoreFreq-kmp-default-2.1.4_k7.2.5_1-3.2.aarch64.rpm"
RPM_HASH = "65093f7f4c391f885df7a3150f9e97d6109ef4003adca19e4ec415302f3e52d21e70282bbc4dd1a8202355ca81dffc1dfc35f8b118b010e05aca639fc18f7749"

RPROVIDES:${PN} += "CoreFreq-kmp \
CoreFreq-kmp-default \
CoreFreq-kmp-default-k7.2.5-1 \
kmod-corefreqk.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default---bitmap-weight \
ksym-default---clocksource-register-scale \
ksym-default---const-udelay \
ksym-default---cpu-present-mask \
ksym-default---cpuhp-remove-state \
ksym-default---cpuhp-setup-state \
ksym-default---dynamic-pr-debug \
ksym-default---fortify-panic \
ksym-default---kmalloc-cache-noprof \
ksym-default---kmalloc-noprof \
ksym-default---kmem-cache-create-args \
ksym-default---msecs-to-jiffies \
ksym-default---per-cpu-offset \
ksym-default---rcu-read-lock \
ksym-default---rcu-read-unlock \
ksym-default---stack-chk-fail \
ksym-default---vma-start-write \
ksym-default---warn-printk \
ksym-default--printk \
ksym-default-acpi-cpc-valid \
ksym-default-acpi-disabled \
ksym-default-acpi-evaluate-integer \
ksym-default-acpi-fetch-acpi-dev \
ksym-default-acpi-get-handle \
ksym-default-acpi-walk-namespace \
ksym-default-add-cpu \
ksym-default-alloc-chrdev-region \
ksym-default-alloc-pages-exact-noprof \
ksym-default-alt-cb-patch-nops \
ksym-default-cancel-delayed-work-sync \
ksym-default-cdev-add \
ksym-default-cdev-alloc \
ksym-default-cdev-del \
ksym-default-class-create \
ksym-default-class-destroy \
ksym-default-clocksource-unregister \
ksym-default-cppc-get-desired-perf \
ksym-default-cppc-get-epp-perf \
ksym-default-cppc-get-perf-caps \
ksym-default-cppc-get-perf-ctrs \
ksym-default-cppc-set-enable \
ksym-default-cppc-set-epp-perf \
ksym-default-cpu-is-hotpluggable \
ksym-default-cpufreq-boost-enabled \
ksym-default-cpufreq-cpu-get \
ksym-default-cpufreq-cpu-put \
ksym-default-cpufreq-get-current-driver \
ksym-default-cpufreq-register-driver \
ksym-default-cpufreq-register-governor \
ksym-default-cpufreq-unregister-driver \
ksym-default-cpufreq-unregister-governor \
ksym-default-cpuidle-get-driver \
ksym-default-cpuidle-register-device \
ksym-default-cpuidle-register-driver \
ksym-default-cpuidle-unregister-device \
ksym-default-cpuidle-unregister-driver \
ksym-default-delayed-work-timer-fn \
ksym-default-dev-pm-opp-find-freq-ceil \
ksym-default-dev-pm-opp-get-voltage \
ksym-default-dev-pm-opp-put \
ksym-default-device-create \
ksym-default-device-destroy \
ksym-default-dmi-get-system-info \
ksym-default-dmi-walk \
ksym-default-dump-stack \
ksym-default-dynamic-preempt-schedule \
ksym-default-free-pages-exact \
ksym-default-free-percpu \
ksym-default-get-cpu-device \
ksym-default-hrtimer-cancel \
ksym-default-hrtimer-cb-get-time \
ksym-default-hrtimer-forward \
ksym-default-hrtimer-setup \
ksym-default-hrtimer-start-range-ns \
ksym-default-init-task \
ksym-default-kfree \
ksym-default-kimage-voffset \
ksym-default-kmalloc-caches \
ksym-default-kmem-cache-alloc-noprof \
ksym-default-kmem-cache-destroy \
ksym-default-kmem-cache-free \
ksym-default-memcpy \
ksym-default-memmove \
ksym-default-memset \
ksym-default-memstart-addr \
ksym-default-module-layout \
ksym-default-nr-cpu-ids \
ksym-default-of-device-compatible-match \
ksym-default-of-find-all-nodes \
ksym-default-of-find-node-by-name \
ksym-default-of-match-node \
ksym-default-of-node-put \
ksym-default-of-property-read-string \
ksym-default-of-root \
ksym-default-param-array-ops \
ksym-default-param-ops-int \
ksym-default-param-ops-short \
ksym-default-param-ops-uint \
ksym-default-param-ops-ullong \
ksym-default-param-ops-ushort \
ksym-default-pci-dev-put \
ksym-default-pci-disable-device \
ksym-default-pci-enable-device \
ksym-default-pci-get-device \
ksym-default-pcpu-alloc-noprof \
ksym-default-queue-delayed-work-on \
ksym-default-random-kmalloc-seed \
ksym-default-remap-pfn-range \
ksym-default-remove-cpu \
ksym-default-smp-call-function-single \
ksym-default-smp-call-on-cpu \
ksym-default-snprintf \
ksym-default-sprintf \
ksym-default-strcmp \
ksym-default-strim \
ksym-default-strlen \
ksym-default-strncmp \
ksym-default-strnlen \
ksym-default-strstr \
ksym-default-system-percpu-wq \
ksym-default-thermal-zone-get-temp \
ksym-default-thermal-zone-get-zone-by-name \
ksym-default-timer-init-key \
ksym-default-unregister-chrdev-region \
suse-kernel-rpm-scriptlets"

inherit rpm
