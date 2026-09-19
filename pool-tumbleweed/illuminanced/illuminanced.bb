SUMMARY = "Ambient Light Sensor Daemon for Linux"
DESCRIPTION = "A user-space daemon that automatically adjusts screen brightness based on light sensor readings."
LICENSE = "GPL-3.0"

PV = "1+git20250306.4c6178c"

RPM_NAME = "illuminanced-1+git20250306.4c6178c-1.8.aarch64.rpm"
RPM_HASH = "0cad19517a0a1758342e1c22817e7db31609e36260591f288db65e71b7ff3326a49189396bfa8c036a75d7ba340c49579b07af85f51d07c647d4d9998a3dd588"

RPROVIDES:${PN} += "bundled-rust-crate-daemonize \
bundled-rust-crate-deranged \
bundled-rust-crate-equivalent \
bundled-rust-crate-error-chain \
bundled-rust-crate-getopts \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-hostname \
bundled-rust-crate-illuminanced \
bundled-rust-crate-indexmap \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-match-cfg \
bundled-rust-crate-memchr \
bundled-rust-crate-num-conv \
bundled-rust-crate-num-threads \
bundled-rust-crate-powerfmt \
bundled-rust-crate-serde \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-simplelog \
bundled-rust-crate-syslog \
bundled-rust-crate-termcolor \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-winnow \
config-illuminanced \
illuminanced"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
