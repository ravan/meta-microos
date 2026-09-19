SUMMARY = "Kernel module to expose the LEDs and battery charge limits of Framework Laptops"
DESCRIPTION = "A kernel module that exposes the Framework Laptop (13, 16)'s battery charge limit and LEDs to userspace."
LICENSE = "GPL-2.0-only"

PV = "1+git20240915.6164bc3_k7.2.4_1"

RPM_NAME = "framework-laptop-kmp-default-1+git20240915.6164bc3_k7.2.4_1-2.38.aarch64.rpm"
RPM_HASH = "4ee32a03b6a42a1897407f03b82d3d415a03d3a0d2424a1790c8adbcacb076972e4d6e63268a37c17f44a53d15b815b8349c7da427262582aae50a94b33b7eaa"

RPROVIDES:${PN} += "framework-laptop-kmp \
framework-laptop-kmp-default \
framework-laptop-kmp-default-k7.2.4-1 \
kmod-framework-laptop.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
ksym-default---platform-driver-register \
ksym-default---stack-chk-fail \
ksym-default--dev-err \
ksym-default--printk \
ksym-default-battery-hook-register \
ksym-default-battery-hook-unregister \
ksym-default-bus-find-device \
ksym-default-cros-ec-cmd \
ksym-default-cros-ec-cmd-xfer-status \
ksym-default-device-add-groups \
ksym-default-device-remove-groups \
ksym-default-devm-kmalloc \
ksym-default-devm-led-classdev-register-ext \
ksym-default-dmi-check-system \
ksym-default-hwmon-device-register-with-groups \
ksym-default-hwmon-device-unregister \
ksym-default-kstrtouint \
ksym-default-memset \
ksym-default-module-layout \
ksym-default-platform-bus-type \
ksym-default-platform-device-add \
ksym-default-platform-device-alloc \
ksym-default-platform-device-del \
ksym-default-platform-device-unregister \
ksym-default-platform-driver-unregister \
ksym-default-put-device \
ksym-default-strcmp \
ksym-default-strncmp \
ksym-default-sysfs-emit \
suse-kernel-rpm-scriptlets"

inherit rpm
