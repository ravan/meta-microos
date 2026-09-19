SUMMARY = "Pic language processor"
DESCRIPTION = "Pic language processor for LaTeX documents or web sites."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2025.08.01"

RPM_NAME = "dpic-2025.08.01-1.3.aarch64.rpm"
RPM_HASH = "408e9ff14415370f7a2b08c944f2f9a332b5a3ae705401633b8d6aba5ad1aa0b65d8635c4a3fe0d5b807d658a4716047ad78a24bd60f540e1b4fee79a53c0bfe"

RPROVIDES:${PN} += "dpic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
