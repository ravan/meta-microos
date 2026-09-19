SUMMARY = "A command line mail reader (or MUA), a fork of Mutt with added features"
DESCRIPTION = "NeoMutt is a command line mail reader based on Mutt, brings together many \
new features. Can be installed in parallel with mutt."
LICENSE = "GPL-2.0-or-later"

PV = "20260406"

RPM_NAME = "neomutt-20260406-1.4.aarch64.rpm"
RPM_HASH = "e83dec0471f761a5a82fd8b1084251c5bf5b6e84485ae6ff2a5f8b95411a2428aa3255eda3c963642697ccc7b116f7b15437252db0dacbb3b029da5144ccee14"

RPROVIDES:${PN} += "config-neomutt \
neomutt"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgpgme.so.45 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libkyotocabinet.so.16 \
liblmdb-0.9.35.so \
liblua5.4.so.5 \
liblz4.so.1 \
libncursesw.so.6 \
libnotmuch.so.5 \
libpcre2-8.so.0 \
libsasl2.so.3 \
libsqlite3.so.0 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
