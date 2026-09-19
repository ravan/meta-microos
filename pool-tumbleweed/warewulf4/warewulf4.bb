SUMMARY = "A suite of tools for clustering"
DESCRIPTION = "Warewulf v4 combines ultra scalability, flexibility, and simplicity with being \
light weight, non-intrusive, and a great tool for scientists and seasoned \
system administrators alike. Warewulf empowers you to scalably and easily \
manage thousands of compute resources."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-4.7.0-4.1.aarch64.rpm"
RPM_HASH = "46fbef82911a16ab9871b5fa56b15dc3b78fc813ccff073f8623f80117b7d3ac2e32744c830d90f51734fbc88eab9492ffcc22c0fd9417d1cd31a65a75c7daf8"

RPROVIDES:${PN} += "config-warewulf4 \
group-warewulf \
user-warewulf \
warewulf4"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2 \
ipxe-bootimgs \
libc.so.6 \
logrotate \
pigz \
sysuser-shadow \
warewulf4-overlay"

inherit rpm
