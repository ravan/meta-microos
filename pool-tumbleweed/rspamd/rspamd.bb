SUMMARY = "Spam filtering system"
DESCRIPTION = "Rspamd is a spam filtering system that allows evaluation of messages \
by a number of rules including regular expressions, statistical analysis and \
custom services such as URL black lists. Each message is analysed by rspamd and \
given a 'spam score'. \
 \
According to this spam score and the user's settings, rspamd recommends an \
action for the MTA to apply to the message, for example to pass, reject or add \
a header.  Rspamd is designed to process hundreds of messages per second \
simultaneously and has a number of features available."
LICENSE = "Apache-2.0"

PV = "4.1.5"

RPM_NAME = "rspamd-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "f050f6126b9081779ed55114b1ced183567d28f28d9c7566671ad1b117be9fc342dd1f64af6ecb2fd240101338083dc47c87c5b0737b065226935d68d1fc6517"

RPROVIDES:${PN} += "bundled-fmt \
config-rspamd \
group--rspamd \
librspamd-actrie.so \
librspamd-ev.so \
librspamd-kann.so \
librspamd-replxx.so \
librspamd-server.so \
rspamd \
user--rspamd"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhs.so.5 \
libicui18n.so.78 \
libicuuc.so.78 \
libjemalloc.so.2 \
libluajit-5.1.so.2 \
libm.so.6 \
libopenblas.so.0 \
libpcre2-8.so.0 \
libsodium.so.26 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
luajit-lpeg \
shadow"

inherit rpm
