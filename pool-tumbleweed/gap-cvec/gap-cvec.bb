SUMMARY = "GAP: Compact vectors over finite fields"
DESCRIPTION = "This package provides an implementation of compact vectors over \
finite fields. Contrary to earlier implementations no table lookups \
are used but only word-based processor arithmetic. This allows for \
bigger finite fields and higher speed."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "gap-cvec-2.8.5-1.3.aarch64.rpm"
RPM_HASH = "b3d625f7964890fd0c6e3e2c62c5d476f8765df57cd08754b1a76e1b5b223515476447b52f0f03a6617c7141f88a355cfedc3cdae74a9ecca3045fc1bf62dfbb"

RPROVIDES:${PN} += "gap-cvec"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-io \
gap-orb \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
