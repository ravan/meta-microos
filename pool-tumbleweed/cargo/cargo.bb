SUMMARY = "The Rust package manager"
DESCRIPTION = "Cargo downloads dependencies of Rust projects and compiles it. \
 \
⚠️  This is the Rust toolchain intended for build pipelines. If you \
want to install Rust for a development environment, you should install \
'rustup' instead."
LICENSE = "Apache-2.0 | MIT"

PV = "1.98.1"

RPM_NAME = "cargo-1.98.1-1.1.aarch64.rpm"
RPM_HASH = "db3de06ac0ea4d23d9ff69fa480cc2a3bbbc10d76776c67fbccddc08b4d7a966808431c1013db597d7f2f8a876cef891b2c47608f600a8919baad5e97d0c3e86"

RPROVIDES:${PN} += "cargo \
rust+cargo"

RDEPENDS:${PN} += "cargo1.98 \
rust"

inherit rpm
