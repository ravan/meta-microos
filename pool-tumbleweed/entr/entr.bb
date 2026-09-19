SUMMARY = "A utility for running arbitrary commands when files change"
DESCRIPTION = "A utility for running arbitrary commands when files change. Uses \
inotify(7) to avoid polling."
LICENSE = "ISC"

PV = "5.8"

RPM_NAME = "entr-5.8-1.3.aarch64.rpm"
RPM_HASH = "f7c4064a9c146d805c17b6bb26b81dc2bf49a3491953ae2d0d381bc3f58066f35a8ee5919dde3af5864e196d7e94191000b50ce20f111ff7265eba0c16b850fb"

RPROVIDES:${PN} += "entr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
