SUMMARY = "Driver for Xbox Wireless Controller"
DESCRIPTION = "Advanced Linux Driver for Xbox One Wireless Controller (shipped with Xbox One S)"
LICENSE = "GPL-3.0-only"

PV = "0.10.1_k7.2.5_1"

RPM_NAME = "xpadneo-kmp-64kb-0.10.1_k7.2.5_1-1.25.aarch64.rpm"
RPM_HASH = "a33fa05df6221c83d316d91ccc956ec5fcd572a2c0d16cd3d8f50306a33dade49f5e34caad3c402ce8045861f97a05003b35eda501862683dcb38838bd2f00da"

RPROVIDES:${PN} += "kmod-hid-xpadneo.ko \
multiversion-kernel \
xpadneo-kmp \
xpadneo-kmp-64kb \
xpadneo-kmp-64kb-k7.2.5-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
ksym-64kb----ratelimit \
ksym-64kb---const-udelay \
ksym-64kb---dynamic-pr-debug \
ksym-64kb---fortify-panic \
ksym-64kb---hid-register-driver \
ksym-64kb---stack-chk-fail \
ksym-64kb---warn-printk \
ksym-64kb--dev-err \
ksym-64kb--dev-info \
ksym-64kb--dev-notice \
ksym-64kb--dev-warn \
ksym-64kb--printk \
ksym-64kb--raw-spin-lock-irqsave \
ksym-64kb--raw-spin-unlock-irqrestore \
ksym-64kb-alloc-workqueue-noprof \
ksym-64kb-alt-cb-patch-nops \
ksym-64kb-cancel-delayed-work-sync \
ksym-64kb-crc16 \
ksym-64kb-delayed-work-timer-fn \
ksym-64kb-destroy-workqueue \
ksym-64kb-devm-input-allocate-device \
ksym-64kb-devm-kasprintf \
ksym-64kb-devm-kmalloc \
ksym-64kb-devm-power-supply-register \
ksym-64kb-dump-stack \
ksym-64kb-hid-hw-close \
ksym-64kb-hid-hw-output-report \
ksym-64kb-hid-hw-start \
ksym-64kb-hid-hw-stop \
ksym-64kb-hid-open-report \
ksym-64kb-hid-unregister-driver \
ksym-64kb-ida-alloc-range \
ksym-64kb-ida-destroy \
ksym-64kb-ida-free \
ksym-64kb-input-event \
ksym-64kb-input-ff-create-memless \
ksym-64kb-input-register-device \
ksym-64kb-input-set-abs-params \
ksym-64kb-input-set-capability \
ksym-64kb-input-unregister-device \
ksym-64kb-jiffies \
ksym-64kb-kernel-param-lock \
ksym-64kb-kernel-param-unlock \
ksym-64kb-kstrtou8 \
ksym-64kb-kstrtouint \
ksym-64kb-memcmp \
ksym-64kb-memcpy \
ksym-64kb-mod-delayed-work-on \
ksym-64kb-mod-timer \
ksym-64kb-module-layout \
ksym-64kb-param-array-ops \
ksym-64kb-param-ops-bool \
ksym-64kb-param-ops-byte \
ksym-64kb-param-ops-charp \
ksym-64kb-power-supply-changed \
ksym-64kb-power-supply-get-drvdata \
ksym-64kb-power-supply-powers \
ksym-64kb-print-hex-dump \
ksym-64kb-sized-strscpy \
ksym-64kb-strcmp \
ksym-64kb-strlen \
ksym-64kb-strncasecmp \
ksym-64kb-strncmp \
ksym-64kb-strnlen \
ksym-64kb-timer-delete-sync \
ksym-64kb-timer-init-key \
suse-kernel-rpm-scriptlets \
xpadneo-ueficert"

inherit rpm
