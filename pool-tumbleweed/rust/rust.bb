SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.98.1"

RPM_NAME = "rust-1.98.1-1.1.aarch64.rpm"
RPM_HASH = "4367d74364b3ef9fee78161f21c8b02618a384aec102d2ae183eb77dc292e2f36c69c7c76c10cf0883f5a978acdb99fb96b6e00c3cba02bda21ae0dfaad566be"

RPROVIDES:${PN} += "rust"

RDEPENDS:${PN} += "rust1.98"

inherit rpm
