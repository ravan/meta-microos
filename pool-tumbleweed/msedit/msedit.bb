SUMMARY = "A simple editor for simple needs"
DESCRIPTION = "This editor pays homage to the classic MS-DOS Editor, but with a modern \
interface and input controls similar to VS Code. The goal is to provide \
an accessible editor that even users largely unfamiliar with terminals can \
easily use."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "msedit-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "6a6dea3b6795b631ccc0290b299b249c88251675b25d2d7503e9fc40825f98d401e1671f19e1c2c919c980bf5523afd998db2b92242360e141f8ae29cb36cd26"

RPROVIDES:${PN} += "bundled-rust-crate-edit \
bundled-rust-crate-libc \
bundled-rust-crate-lsh \
bundled-rust-crate-smallvec \
bundled-rust-crate-stdext \
bundled-rust-crate-toml-span \
msedit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
