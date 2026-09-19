SUMMARY = "Default plugins for the audit dispatcher"
DESCRIPTION = "The audit-audispd-plugins package contains plugin components for the \
audit dispatcher (audispd)."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.2"

RPM_NAME = "audit-audispd-plugins-4.0.2-3.5.aarch64.rpm"
RPM_HASH = "b8c8bf9b2e7d89d59ea52d20701fa035aa3dec4a615c01144c722c7c168fb8f54695bdf8e4dd6152c2beccc6f7d6294c2fc1a78524ad1ef1cbe854db32e31172"

RPROVIDES:${PN} += "audit-audispd-plugins \
config-audit-audispd-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
liblber.so.2 \
libldap.so.2"

inherit rpm
