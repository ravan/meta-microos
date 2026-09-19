SUMMARY = "Modular IRC Client"
DESCRIPTION = "Irssi is a modular IRC client that currently only has a text mode \
user interface. However, 80–90% of the code is not text mode \
specific, so other UIs could be created. Irssi is not IRC specific; \
there are SILC and ICB modules available. \
 \
Irssi is not using the ircII code."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "irssi-1.4.5-3.17.aarch64.rpm"
RPM_HASH = "1717213b7ae5e20c3866d31f1c3f6ed28f885290cc6ddbe7184d748f47fc2f3ad6ca6ed9e3d1170e01010b398a1cb999415238741ef9196ffaebbb07adbcb7c7"

RPROVIDES:${PN} += "irssi \
libfe-perl.so \
libirc-proxy.so \
libotr-core.so \
libperl-core.so \
perl-Irssi \
perl-Irssi--Irc \
perl-Irssi--TextUI \
perl-Irssi--UI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libotr.so.5 \
libperl.so \
libssl.so.3 \
libtinfo.so.6 \
libutf8proc.so.3 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
