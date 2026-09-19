SUMMARY = "SMTP output support for syslog-ng"
DESCRIPTION = "This package provides the afsmtp module providing support for \
logging into SMTP."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-smtp-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "b6f8fe6bde5ab74d03d8cd3c5010eeb82d4bef2a6f723c113d59818576c173f19775d140decaca9123f98083239d43b03c4417e9ec4ad65a64f7f06bd8f6af7b"

RPROVIDES:${PN} += "syslog-ng-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libesmtp.so.6.2.0 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
