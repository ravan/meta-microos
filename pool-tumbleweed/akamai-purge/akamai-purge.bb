SUMMARY = "Akamai CDN FastPurge Client"
DESCRIPTION = "Akamai CLI for Purge allows you to purge cached content from the Edge using FastPurge (CCUv3). \
 \
FastPurge will typically invalidate (recommended), or delete cached content in under five seconds."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "akamai-purge-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "f944e97812e390e4bcd1f2b80bb501ea188bf6974ab5fbc11c503b72575d1e747c7dcef03ae608a62c43ab0ecad0af64eaddf0c0493788cf4c4fec867674773f"

RPROVIDES:${PN} += "akamai-purge"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
