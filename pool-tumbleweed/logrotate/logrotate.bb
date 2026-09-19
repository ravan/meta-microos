SUMMARY = "Cron service for rotating, compressing, mailing and removing system log files"
DESCRIPTION = "The logrotate utility does automatic rotation, compression, mailing and removal \
of log files. Logrotate can be set to handle a log file daily, weekly, monthly, \
or when the log file reaches a certain size. Normally, logrotate runs as a \
daily cron job. \
 \
It manages plain files only and is not involved in systemd's journal rotation."
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "logrotate-3.22.0-2.8.aarch64.rpm"
RPM_HASH = "a50516225f2b202884580f6cf9d6607ffcb986978fc14125fe0eb84d6101a93e9c6778691f772a0995b05bafe064a4439e3bff63aaffb6be13a52d828c100179"

RPROVIDES:${PN} += "logrotate"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xz \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libpopt.so.0 \
libselinux.so.1"

inherit rpm
