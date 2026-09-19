SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20260813"

RPM_NAME = "cargo-audit-advisory-db-20260813-1.1.aarch64.rpm"
RPM_HASH = "3e43cfff6d3e5fb4ab7b42d312555fbbd7724c57be2b8ffaa5799e57f0d4686031f1316591ad985d2e35e41e558eed51f44ae13c69c6307cdfa9b9679bd8af60"

RPROVIDES:${PN} += "cargo-audit-advisory-db"

RDEPENDS:${PN} += "cargo-audit"

inherit rpm
