SUMMARY = "Perl 5 bindings for the libdnf5-cli library"
DESCRIPTION = "Perl 5 bindings for the libdnf5-cli library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "perl-libdnf5-cli-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "b0eb0b3aac83b56bbdb25ba132925dcb62588cf895d066d514b5e18a812bbd6e21f0e4aae143f239cd21b09ed2401168af1405fae4239d138d718cd8b2eb8435"

RPROVIDES:${PN} += "perl-libdnf5-cli \
perl-libdnf5-cli--DownloadProgressBar \
perl-libdnf5-cli--MultiProgressBar \
perl-libdnf5-cli--ProgressBar \
perl-libdnf5-cli--progressbar \
perl-libdnf5-clic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libgcc-s.so.1 \
libperl.so \
libstdc++.so.6"

inherit rpm
