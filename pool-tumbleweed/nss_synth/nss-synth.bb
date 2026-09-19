SUMMARY = "A module that synthesises uid/gid's from bare uid's for container compatibility"
DESCRIPTION = "NSS Synth is a module that synthesises uids/gids into real groups. This means that when you have a \
container with bare uids/gids, these are able to resolve to a concrete user name and group name so \
that calls like getpwnam() function correctly."
LICENSE = "MPL-2.0"

PV = "0.1.0~git2.ed6985d"

RPM_NAME = "nss_synth-0.1.0~git2.ed6985d-2.16.aarch64.rpm"
RPM_HASH = "9976dbca761ee69487364f1fb8e72568e8082c3641ad01395693f37a4b7baca2a1f1c62148e991d5b917703b52799ce12fc986e8feacaa7f85feb08d4a89afa7"

RPROVIDES:${PN} += "bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libnss \
bundled-rust-crate-nss-synth \
bundled-rust-crate-paste \
bundled-rust-crate-paste-impl \
bundled-rust-crate-proc-macro-hack \
libnss-synth.so.2 \
nss-synth"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
