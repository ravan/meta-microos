SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kio_perldoc-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "371628d4d23d83a38a6585ff92c0ca861f30c0a757933348a9e253746b33fcee876485aca92415454a2a4e276b505d7c09927aba578399d75020b01371c6fb7b"

RPROVIDES:${PN} += "kio-perldoc"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
