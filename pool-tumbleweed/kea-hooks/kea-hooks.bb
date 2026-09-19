SUMMARY = "Standard Kea DHCP hooks/plugins"
DESCRIPTION = "A standard set of external libraries used to provide additional \
functionality for Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "kea-hooks-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "51c85748a5dc5de1d28224b073359d26b3e751eafd06c0e79762df5b05c5dac442852543a4187c91257d62d82f3d7bfed204ea58d2c5635cfa656690a7a5dc2f"

RPROVIDES:${PN} += "kea-hooks \
libddns-gss-tsig.so \
libdhcp-bootp.so \
libdhcp-class-cmds.so \
libdhcp-ddns-tuning.so \
libdhcp-flex-id.so \
libdhcp-flex-option.so \
libdhcp-ha.so \
libdhcp-host-cache.so \
libdhcp-host-cmds.so \
libdhcp-lease-cmds.so \
libdhcp-lease-query.so \
libdhcp-legal-log.so \
libdhcp-limits.so \
libdhcp-mysql.so \
libdhcp-perfmon.so \
libdhcp-pgsql.so \
libdhcp-ping-check.so \
libdhcp-radius.so \
libdhcp-run-script.so \
libdhcp-stat-cmds.so \
libdhcp-subnet-cmds.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libkea-asiodns.so.75 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-config.so.98 \
libkea-cryptolink.so.76 \
libkea-d2srv.so.75 \
libkea-database.so.88 \
libkea-dhcp.so.129 \
libkea-dhcpsrv.so.149 \
libkea-dns.so.84 \
libkea-eval.so.97 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-http.so.100 \
libkea-log.so.86 \
libkea-mysql.so.106 \
libkea-pgsql.so.105 \
libkea-process.so.105 \
libkea-stats.so.64 \
libkea-tcp.so.45 \
libkea-util.so.118 \
libmariadb.so.3 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
