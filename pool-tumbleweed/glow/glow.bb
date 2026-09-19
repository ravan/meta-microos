SUMMARY = "Render markdown on the CLI"
DESCRIPTION = "Glow is a terminal based markdown reader designed from the ground up to bring \
out the beauty—and power—of the CLI. \
 \
Use it to discover markdown files, read documentation directly on the command \
line and stash markdown files to your own private collection so you can read \
them anywhere. Glow will find local markdown files in subdirectories or a local \
Git repository."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "glow-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "41a5703bd6f8e8e1e5c22e2096ebbe14030aa41b705a1935699197eedce131ba10045e31c333211a7e0c3df0b67cd32d5c49bc7fad3bdd27ae4a058f3ac71452"

RPROVIDES:${PN} += "glow"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
