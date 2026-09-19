SUMMARY = "A tool for securing communications between a client and a DNS resolver"
DESCRIPTION = "A flexible DNS proxy, with support for modern encrypted DNS protocols \
such as DNSCrypt v2, DNS-over-HTTPS, Anonymized DNSCrypt \
and ODoH (Oblivious DoH)."
LICENSE = "ISC"

PV = "2.1.18"

RPM_NAME = "dnscrypt-proxy-2.1.18-1.1.aarch64.rpm"
RPM_HASH = "ce5db365fa3e42e203a14eee42637835b81c5f4f9a186b6b5662f61e0626581453184da7a212b46a00a089940774e0281e1828c0dfeaa3c4311842b2f377de54"

RPROVIDES:${PN} += "config-dnscrypt-proxy \
dnscrypt \
dnscrypt-proxy \
group-dnscrypt \
user-dnscrypt"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
bash \
libc.so.6 \
systemd \
sysuser-shadow"

inherit rpm
