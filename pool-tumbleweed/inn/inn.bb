SUMMARY = "InterNetNews"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-2.6.5-4.2.aarch64.rpm"
RPM_HASH = "462bf9ebf788afe1060946dc868384b210d12ec1e794130249e142ad07cacc45b6280711875a2bb5c8a455dafcfcd041dffe4ac89215060e7090afc31ec1da6f"

RPROVIDES:${PN} += "config-inn \
inn \
inn-pkg \
nntp-daemon \
perl-INN--Config \
perl-INN--Utils--Shlock \
perl-innreport-inn"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
group-news \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgdbm-compat.so.4 \
libpam.so.0 \
libperl.so \
libpython3.13.so.1.0 \
libssl.so.3 \
libz.so.1 \
perl \
perl-GD \
perl-MIME--Parser \
perl-MIME-tools \
permissions \
systemd \
user-news"

inherit rpm
