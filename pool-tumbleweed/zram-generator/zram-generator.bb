SUMMARY = "Systemd unit generator for zram swap devices"
DESCRIPTION = "This is a systemd unit generator that enables swap on zram. \
(With zram, there is no physical swap device. Part of the avaialable RAM \
is used to store compressed pages, essentially trading CPU cycles for memory.) \
 \
To configure and activate swap and zram devices with file-systems,  create a configuration file in /etc/systemd/zram-generator.conf. You can consult  /usr/share/doc/zram-generator/zram-generator.conf.example for an example and a list of available settings."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "zram-generator-1.2.1-1.12.aarch64.rpm"
RPM_HASH = "fd104312a9f4e59f30a3517b3e59aa1d6d3ac2925664b269bcc91b83b65a7c50948176a1bbb45789870809e5bdb2c9e78daed0d0b565e5e85d93581fb6c43fc9"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-anstyle \
bundled-rust-crate-anyhow \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-lex \
bundled-rust-crate-dlv-list \
bundled-rust-crate-fasteval \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-libc \
bundled-rust-crate-liboverdrop \
bundled-rust-crate-log \
bundled-rust-crate-once-cell \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-rust-ini \
bundled-rust-crate-version-check \
bundled-rust-crate-zram-generator \
zram-generator"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
