SUMMARY = "Graphical frontend for Hydra"
DESCRIPTION = "XHydra is a GTK graphical frontend for the Hydra network login cracker."
LICENSE = "AGPL-3.0-only"

PV = "9.7+git20.gbccaea1"

RPM_NAME = "xhydra-9.7+git20.gbccaea1-2.1.aarch64.rpm"
RPM_HASH = "8c4f5476c41d92b5164660d2cff6450d6d08db659abdf23507b4ea864382a3cad1ee375c8ef0b7e813c7fad8a1f845669bfc5ecb855cc7194a3e30f7191e8560"

RPROVIDES:${PN} += "xhydra"

RDEPENDS:${PN} += "hydra \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
