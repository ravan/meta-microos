SUMMARY = "Daemon for managing gss-api requests"
DESCRIPTION = "gssproxy allows the complexity of GSS security negotiation \
to be centrallized.  It is particularly useful to keep this out \
of kernel space, so that CIPFS, NFS, AFS etc can use GSS-API without \
complexity in the kernel. \
 \
Using it also improves isolation and privilege separation, so that \
HTTP servers, for example, can use GSS-API without needing to access \
keys directly."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "gssproxy-0.9.2-1.3.aarch64.rpm"
RPM_HASH = "49678bbe5259a5aec5f3f20912e4e384c0b55abb3a686d4f4ba4948f2c71aca1b1f2e6d7720a9fb250775b73a4690abd8ee518ed4f613ed6a473cfb0ced53590"

RPROVIDES:${PN} += "config-gssproxy \
gssproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libini-config.so.8 \
libk5crypto.so.3 \
libkrb5.so.3 \
libpopt.so.0 \
libselinux.so.1 \
libverto-module-base \
libverto.so.1 \
systemd"

inherit rpm
