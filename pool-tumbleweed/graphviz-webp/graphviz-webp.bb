SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-webp-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "118dd557d39e01d85213d9fa5ae67161e40784cd9ac465d5d70ba949d4e92e29bc4f873287689eaa44e87ef0223480ca25cf97911b8946cb6b95d1821ce2cdc4"

RPROVIDES:${PN} += "graphviz-webp \
libgvplugin-webp.so.8"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
graphviz-gnome \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgvc.so.7 \
libwebp.so.7"

inherit rpm
