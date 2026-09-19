SUMMARY = "Driver for Xbox Wireless Controller"
DESCRIPTION = "Advanced Linux Driver for Xbox One Wireless Controller (shipped with Xbox One S)"
LICENSE = "GPL-3.0-only"

PV = "0.10.1_k6.18.51_1"

RPM_NAME = "xpadneo-kmp-longterm-0.10.1_k6.18.51_1-1.25.aarch64.rpm"
RPM_HASH = "8e059cd8f6968236735125b467cea2a413cee9aafcb84a39fff290cde974726f43e6b74561878bfead1338658c59a2574905b35a5011172fa579ea13e1d55a1b"

RPROVIDES:${PN} += "kmod-hid-xpadneo.ko \
multiversion-kernel \
xpadneo-kmp \
xpadneo-kmp-longterm \
xpadneo-kmp-longterm-k6.18.51-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-longterm \
ksym-longterm----ratelimit \
ksym-longterm---const-udelay \
ksym-longterm---dynamic-pr-debug \
ksym-longterm---fortify-panic \
ksym-longterm---hid-register-driver \
ksym-longterm---stack-chk-fail \
ksym-longterm---warn-printk \
ksym-longterm--dev-err \
ksym-longterm--dev-info \
ksym-longterm--dev-notice \
ksym-longterm--dev-warn \
ksym-longterm--printk \
ksym-longterm--raw-spin-lock-irqsave \
ksym-longterm--raw-spin-unlock-irqrestore \
ksym-longterm-alloc-workqueue-noprof \
ksym-longterm-alt-cb-patch-nops \
ksym-longterm-cancel-delayed-work-sync \
ksym-longterm-crc16 \
ksym-longterm-delayed-work-timer-fn \
ksym-longterm-destroy-workqueue \
ksym-longterm-devm-input-allocate-device \
ksym-longterm-devm-kasprintf \
ksym-longterm-devm-kmalloc \
ksym-longterm-devm-power-supply-register \
ksym-longterm-hid-hw-close \
ksym-longterm-hid-hw-output-report \
ksym-longterm-hid-hw-start \
ksym-longterm-hid-hw-stop \
ksym-longterm-hid-open-report \
ksym-longterm-hid-unregister-driver \
ksym-longterm-ida-alloc-range \
ksym-longterm-ida-destroy \
ksym-longterm-ida-free \
ksym-longterm-input-event \
ksym-longterm-input-ff-create-memless \
ksym-longterm-input-register-device \
ksym-longterm-input-set-abs-params \
ksym-longterm-input-set-capability \
ksym-longterm-input-unregister-device \
ksym-longterm-jiffies \
ksym-longterm-jiffies-to-msecs \
ksym-longterm-kernel-param-lock \
ksym-longterm-kernel-param-unlock \
ksym-longterm-kstrtou8 \
ksym-longterm-kstrtouint \
ksym-longterm-memcmp \
ksym-longterm-memcpy \
ksym-longterm-mod-delayed-work-on \
ksym-longterm-mod-timer \
ksym-longterm-module-layout \
ksym-longterm-param-array-ops \
ksym-longterm-param-ops-bool \
ksym-longterm-param-ops-byte \
ksym-longterm-param-ops-charp \
ksym-longterm-power-supply-changed \
ksym-longterm-power-supply-get-drvdata \
ksym-longterm-power-supply-powers \
ksym-longterm-print-hex-dump \
ksym-longterm-sized-strscpy \
ksym-longterm-strcmp \
ksym-longterm-strlen \
ksym-longterm-strncasecmp \
ksym-longterm-strncmp \
ksym-longterm-strnlen \
ksym-longterm-timer-delete-sync \
ksym-longterm-timer-init-key \
suse-kernel-rpm-scriptlets \
xpadneo-ueficert"

inherit rpm
