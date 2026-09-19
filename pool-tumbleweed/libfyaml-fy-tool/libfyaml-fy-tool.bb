SUMMARY = "Command line tools for libfyaml"
DESCRIPTION = "This package provides a couple of command line tools for processing \
YAML using libfyaml."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "libfyaml-fy-tool-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "823058b8ee992dadcd83e1e399c6baaaf5e8d944a2b2484d945cb37b9bfc70095efb4cd8e25b934c4b88b1b95e8857129daa4e49d7c6c1fab11a82d67557834b"

RPROVIDES:${PN} += "libfyaml \
libfyaml-fy-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfyaml.so.0 \
libfyaml0"

inherit rpm
