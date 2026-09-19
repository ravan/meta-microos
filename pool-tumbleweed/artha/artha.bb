SUMMARY = "Offline English thesaurus based on WordNet"
DESCRIPTION = "Artha is a free cross-platform English thesaurus that works \
completely off-line and is based on WordNet."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "artha-1.0.5-1.26.aarch64.rpm"
RPM_HASH = "757139ba09ed2341df006a332b31f604470ce508c474ed9fe6820a72935b0319a010bae74a2176522c47c243c70e568e30e15dc4d46a92179594f624ea651d52"

RPROVIDES:${PN} += "artha"

RDEPENDS:${PN} += "enchant \
hunspell \
ld-linux-aarch64.so.1 \
libWN.so.3 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
wordnet"

inherit rpm
