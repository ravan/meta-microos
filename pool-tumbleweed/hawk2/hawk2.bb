SUMMARY = "HA Web Konsole"
DESCRIPTION = "A web-based GUI for managing and monitoring the Pacemaker \
High-Availability cluster resource manager."
LICENSE = "GPL-2.0-only"

PV = "2.7.2+git.1788518533.7d4dadd6"

RPM_NAME = "hawk2-2.7.2+git.1788518533.7d4dadd6-1.1.aarch64.rpm"
RPM_HASH = "664c0d95e8ebbe52e71cce04a4172c9454b9fe5e83f025e7c29aaa2ca3a536a4db2dcb23129dc22740ece29767c54158992f0640ee4c4a0fe199238eb5c758b2"

RPROVIDES:${PN} += "group-haclient \
group-hacluster \
ha-cluster-webui \
hawk \
hawk2 \
libsass.so \
user-hacluster"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/ruby \
/usr/bin/sh \
/usr/bin/touch \
crmsh \
dejavu \
fillup \
graphviz \
graphviz-gd \
hawk-apiserver \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libffi.so.8 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
openssl \
pacemaker \
permissions \
rubygem-ruby-4.0.0-bundler \
systemd \
sysuser-shadow"

inherit rpm
