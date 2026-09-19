SUMMARY = "Reliable key-value store for the most critical data of a distributed system"
DESCRIPTION = "etcd is a distributed reliable key-value store for the most critical data of a \
distributed system, with a focus on being: \
 \
- Simple: well-defined, user-facing API (gRPC) \
- Secure: automatic TLS with optional client cert authentication \
- Fast: benchmarked 10,000 writes/sec \
- Reliable: properly distributed using Raft"
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "etcd-3.7.1-1.2.aarch64.rpm"
RPM_HASH = "e945474109cf43ddf76f3b0e2e9580d00dc3f1e0da67542b695b7af2c47674d9b8f1b0586b73a230ad69798f64b5fb1b2f10b5d38d444dc8983649a6bcf8874d"

RPROVIDES:${PN} += "config-etcd \
etcd \
group-etcd \
user-etcd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
sysuser-shadow"

inherit rpm
