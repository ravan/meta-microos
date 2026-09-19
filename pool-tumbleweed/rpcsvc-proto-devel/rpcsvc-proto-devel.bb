SUMMARY = "RPC protocol definitions"
DESCRIPTION = "The rpcsvc-proto package includes several rpcsvc header files \
and RPC protocol definitions from SunRPC sources (as shipped with \
glibc)."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "rpcsvc-proto-devel-1.4.4-1.11.aarch64.rpm"
RPM_HASH = "a8cc31409b94b336aef382056efa73cbfa951542970660eb69739edf12312265e0a8ffd4b8a087132727ff954265662d60e316e1428c984925da200958f95d29"

RPROVIDES:${PN} += "rpcsvc-proto-devel"

RDEPENDS:${PN} += ""

inherit rpm
