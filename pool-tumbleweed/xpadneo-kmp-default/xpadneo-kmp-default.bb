SUMMARY = "Driver for Xbox Wireless Controller"
DESCRIPTION = "Advanced Linux Driver for Xbox One Wireless Controller (shipped with Xbox One S)"
LICENSE = "GPL-3.0-only"

PV = "0.10.1_k7.2.5_1"

RPM_NAME = "xpadneo-kmp-default-0.10.1_k7.2.5_1-1.25.aarch64.rpm"
RPM_HASH = "277f1e9655bb133e51a2ea82a6d0025a8ad9e43bcc3a9513d5085450a3be4048625c818f1e55eb7a5101fc4c00b7c3d045876ff96fdb0b0ac6f17ec6ba69b707"

RPROVIDES:${PN} += "kmod-hid-xpadneo.ko \
multiversion-kernel \
xpadneo-kmp \
xpadneo-kmp-default \
xpadneo-kmp-default-k7.2.5-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
ksym-default----ratelimit \
ksym-default---const-udelay \
ksym-default---dynamic-pr-debug \
ksym-default---fortify-panic \
ksym-default---hid-register-driver \
ksym-default---stack-chk-fail \
ksym-default---warn-printk \
ksym-default--dev-err \
ksym-default--dev-info \
ksym-default--dev-notice \
ksym-default--dev-warn \
ksym-default--printk \
ksym-default--raw-spin-lock-irqsave \
ksym-default--raw-spin-unlock-irqrestore \
ksym-default-alloc-workqueue-noprof \
ksym-default-alt-cb-patch-nops \
ksym-default-cancel-delayed-work-sync \
ksym-default-crc16 \
ksym-default-delayed-work-timer-fn \
ksym-default-destroy-workqueue \
ksym-default-devm-input-allocate-device \
ksym-default-devm-kasprintf \
ksym-default-devm-kmalloc \
ksym-default-devm-power-supply-register \
ksym-default-dump-stack \
ksym-default-hid-hw-close \
ksym-default-hid-hw-output-report \
ksym-default-hid-hw-start \
ksym-default-hid-hw-stop \
ksym-default-hid-open-report \
ksym-default-hid-unregister-driver \
ksym-default-ida-alloc-range \
ksym-default-ida-destroy \
ksym-default-ida-free \
ksym-default-input-event \
ksym-default-input-ff-create-memless \
ksym-default-input-register-device \
ksym-default-input-set-abs-params \
ksym-default-input-set-capability \
ksym-default-input-unregister-device \
ksym-default-jiffies \
ksym-default-kernel-param-lock \
ksym-default-kernel-param-unlock \
ksym-default-kstrtou8 \
ksym-default-kstrtouint \
ksym-default-memcmp \
ksym-default-memcpy \
ksym-default-mod-delayed-work-on \
ksym-default-mod-timer \
ksym-default-module-layout \
ksym-default-param-array-ops \
ksym-default-param-ops-bool \
ksym-default-param-ops-byte \
ksym-default-param-ops-charp \
ksym-default-power-supply-changed \
ksym-default-power-supply-get-drvdata \
ksym-default-power-supply-powers \
ksym-default-print-hex-dump \
ksym-default-sized-strscpy \
ksym-default-strcmp \
ksym-default-strlen \
ksym-default-strncasecmp \
ksym-default-strncmp \
ksym-default-strnlen \
ksym-default-timer-delete-sync \
ksym-default-timer-init-key \
suse-kernel-rpm-scriptlets \
xpadneo-ueficert"

inherit rpm
