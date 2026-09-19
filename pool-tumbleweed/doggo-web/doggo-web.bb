SUMMARY = "Web UI for doggo"
DESCRIPTION = "HTTP server for doggo that provides a web browser UI for making DNS queries"
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "doggo-web-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "73f59c9c28cfb4c04e29bee750363c65d50767045f709203af5a873600d3d68c3cda3aed8d7b0443eb2b9ba0d29b077d2c0cace9d8559cdd6bc64a5dfd68df26"

RPROVIDES:${PN} += "doggo-web"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
