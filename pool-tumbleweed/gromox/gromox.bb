SUMMARY = "Groupware server backend with RPC, IMAP,POP3, PHP-MAPI support"
DESCRIPTION = "Gromox is the central groupware server component of grommunio. It is \
capable of serving as a replacement for Microsoft Exchange and \
compatibles. Connectivity options include RPC/HTTP (Outlook \
Anywhere), MAPI/HTTP, IMAP, POP3, an SMTP-speaking LDA, and a PHP \
module with a Z-MAPI function subset. \
 \
Import is possible from PST/OST/MSG/CDFV2/TNEF, EML/ICAL/VCF, Kopano, \
Zarafa, and via imapsync. \
 \
Gromox relies on other components to provide a sensibly complete mail \
system, such as Postfix as a mail transfer agent, and grommunio-admin \
for user management. A webmail client interface is available with \
grommunio-web. The grommunio appliance ships these essentials and has a \
ready-to-run installation of Gromox."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "gromox-3.10-1.1.aarch64.rpm"
RPM_HASH = "fe386468ddd3e032bdcffe435d7f8ce3bae2eaf2eff9fa14ee2e860673c9dfc04f8e2ee6b9356c91e00c6ee07d3307c0147417c8d1ea742972518aeb19d2d65c"

RPROVIDES:${PN} += "gromox \
libgromox-abtree.so.0 \
libgromox-auth.so.0 \
libgromox-authz.so.0 \
libgromox-common.so.0 \
libgromox-dbop.so.0 \
libgromox-emsmdb.so.0 \
libgromox-ews.so.0 \
libgromox-exrpc.so.0 \
libgromox-mapi.so.0 \
libgromox-mh-emsmdb.so.0 \
libgromox-mh-nsp.so.0 \
libgromox-ndr.so.0 \
libgromox-nsp.so.0 \
libgromox-oab.so.0 \
libgromox-oxdisco.so.0 \
libgromox-rfr.so.0 \
libgxm-alias-resolve.so.0 \
libgxm-exmdb-local.so.0 \
libgxs-event-proxy.so.0 \
libgxs-event-stub.so.0 \
libgxs-exmdb-provider.so.0 \
libgxs-midb-agent.so.0 \
libgxs-mysql-adaptor.so.0 \
libgxs-ruleproc.so.0 \
libgxs-timer-agent.so.0 \
php-mapi-gromox"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
glibc-locale-base \
group-gromox \
group-gromoxcf \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libesedb.so.1 \
libfmt.so.12 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libjsoncpp.so.27 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libolecf.so.1 \
libpam.so.0 \
libpff.so.1 \
libresolv.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtinyxml2.so.11 \
libwmime.so.2 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
php8-cli \
php8-fpm \
php8-mysql \
php8-posix \
php8-soap \
user-grommunio \
user-gromox"

inherit rpm
