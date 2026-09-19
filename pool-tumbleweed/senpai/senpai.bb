SUMMARY = "Your everyday IRC student"
DESCRIPTION = "senpai is an IRC client that works best with bouncers: \
 \
 * no logs are kept, \
 * history is fetched from the server via CHATHISTORY, \
 * networks are fetched from the server via bouncer-networks, \
 * messages can be searched in logs via SEARCH, \
 * files can be uploaded via FILEHOST (with drag & drop!)"
LICENSE = "ISC"

PV = "0.5.0"

RPM_NAME = "senpai-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "4dad66f6c09ea462fdb51a3547734d73dec07fa0d04d7fb9d3a94cddadc90858121222c44926fb4254c9263bae34dacf09ccf47cf54c5cd45e47b371a0dfd381"

RPROVIDES:${PN} += "senpai"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
