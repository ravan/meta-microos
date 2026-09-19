SUMMARY = "Generate command-line completions using a simple DSL"
DESCRIPTION = " \
Generate tab completion for any shell command by specifying its usage in a familiar manpage-like format."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-1.0+git.20220402.ec8fccc-1.25.aarch64.rpm"
RPM_HASH = "021e7220813690d273f4c8a99541da4b5863b49e51a8a24b23f4890f0d563224bd6b6c1a8d0ccd596aea2cb070c0d2d658a665fb2570f99bc8e39025fd641d20"

RPROVIDES:${PN} += "compleat"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
