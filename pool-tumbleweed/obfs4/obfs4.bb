SUMMARY = "Pluggable transport proxy for Tor"
DESCRIPTION = "A tool that attempts to circumvent censorship by transforming the Tor traffic \
between the client and the bridge. This way censors, who usually monitor traffic \
between the client and the bridge, will see innocent-looking transformed traffic \
instead of the actual Tor traffic."
LICENSE = "BSD-2-Clause & GPL-3.0-only"

PV = "0.0.13"

RPM_NAME = "obfs4-0.0.13-1.26.aarch64.rpm"
RPM_HASH = "ac653e2dad629bd8a2ee494758673816073f33e988ae3cbda2437f6106ad20989607729925abf0a566a5adfc243a39ed2cdc286949af0a3514c26ebd13964a57"

RPROVIDES:${PN} += "obfs4"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
