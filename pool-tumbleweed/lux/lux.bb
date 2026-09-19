SUMMARY = "A video downloader built with Go"
DESCRIPTION = "Lux is a video downloader built with Go."
LICENSE = "MIT"

PV = "0.24.1"

RPM_NAME = "lux-0.24.1-1.3.aarch64.rpm"
RPM_HASH = "06ece1dd4eb1b1d9dda5c66d28f59ba1cce92546d988d7c3b4535d671d4cadcff1c77688d044eb50bf3b16d21d8b1ef6e26d4edec59b323db7bf19eab545f75c"

RPROVIDES:${PN} += "lux"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6"

inherit rpm
