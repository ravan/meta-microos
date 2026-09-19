SUMMARY = "Endpoint visibility and collection tool (endpoint only)"
DESCRIPTION = "Velociraptor is a tool for collecting host based state information \
using The Velociraptor Query Language (VQL) queries. \
 \
To learn more about Velociraptor, read the documentation on: \
 \
https://docs.velociraptor.app/ \
 \
This package contains only the endpoint agent.  For the full server and GUI \
console, please install the 'velociraptor' package."
LICENSE = "AGPL-3.0-only"

PV = "0.7.0.4.git185.a5708584"

RPM_NAME = "velociraptor-client-0.7.0.4.git185.a5708584-2.4.aarch64.rpm"
RPM_HASH = "15a0b8fbcfce7314d8d9c82d1d0fb3cf665f01639bf5aafd642c79b5f25cfd2eba91dc2aa4752f7165feae021f3170d8d2cdfa975b95f470fedee400b7ab4714"

RPROVIDES:${PN} += "config-velociraptor-client \
velociraptor-client \
velociraptor-client-project-openSUSE-Factory-ARM"

RDEPENDS:${PN} += "/usr/bin/sh \
group-velociraptor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
sysuser-shadow"

inherit rpm
