SUMMARY = "Kernel module to expose the LEDs and battery charge limits of Framework Laptops"
DESCRIPTION = "A kernel module that exposes the Framework Laptop (13, 16)'s battery charge limit and LEDs to userspace."
LICENSE = "GPL-2.0-only"

PV = "1+git20240915.6164bc3_k7.2.4_1"

RPM_NAME = "framework-laptop-kmp-64kb-1+git20240915.6164bc3_k7.2.4_1-2.38.aarch64.rpm"
RPM_HASH = "1734fd198512fe69aa63dc68e499cd5ca23159af1aa4a9c7ebb2bc9fee8def7c74fb2e38c9de18ef42b13501569c0adafa5dbcc32b9dc8cb11ff06f697c3e9c7"

RPROVIDES:${PN} += "framework-laptop-kmp \
framework-laptop-kmp-64kb \
framework-laptop-kmp-64kb-k7.2.4-1 \
kmod-framework-laptop.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
ksym-64kb---platform-driver-register \
ksym-64kb---stack-chk-fail \
ksym-64kb--dev-err \
ksym-64kb--printk \
ksym-64kb-battery-hook-register \
ksym-64kb-battery-hook-unregister \
ksym-64kb-bus-find-device \
ksym-64kb-cros-ec-cmd \
ksym-64kb-cros-ec-cmd-xfer-status \
ksym-64kb-device-add-groups \
ksym-64kb-device-remove-groups \
ksym-64kb-devm-kmalloc \
ksym-64kb-devm-led-classdev-register-ext \
ksym-64kb-dmi-check-system \
ksym-64kb-hwmon-device-register-with-groups \
ksym-64kb-hwmon-device-unregister \
ksym-64kb-kstrtouint \
ksym-64kb-memset \
ksym-64kb-module-layout \
ksym-64kb-platform-bus-type \
ksym-64kb-platform-device-add \
ksym-64kb-platform-device-alloc \
ksym-64kb-platform-device-del \
ksym-64kb-platform-device-unregister \
ksym-64kb-platform-driver-unregister \
ksym-64kb-put-device \
ksym-64kb-strcmp \
ksym-64kb-strncmp \
ksym-64kb-sysfs-emit \
suse-kernel-rpm-scriptlets"

inherit rpm
