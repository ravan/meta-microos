SUMMARY = "Open Source realtime backend"
DESCRIPTION = "PocketBase is an open source Go backend that includes: \
 \
- embedded database (SQLite) with realtime subscriptions \
- built-in files and users management \
- convenient Admin dashboard UI \
- and simple REST-ish API"
LICENSE = "MIT"

PV = "0.40.1"

RPM_NAME = "pocketbase-0.40.1-1.1.aarch64.rpm"
RPM_HASH = "81138f56a1cbfde164bb935a261425c713ce4e04f049ab12390cbb8b7b31a240e5b9a70818efca07c20fb794b96582fe018cdd299b1024bbf660d364fa2ef740"

RPROVIDES:${PN} += "pocketbase"

RDEPENDS:${PN} += ""

inherit rpm
