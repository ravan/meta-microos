SUMMARY = "Devel files for radare2"
DESCRIPTION = "Development files for radare2"
LICENSE = "LGPL-3.0-only"

PV = "6.2.2"

RPM_NAME = "radare2-devel-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "ca3c751e52e2818025ea3c78329351cb4e46b06f9875fb5602b9c2185958473b70cd67ee308b45d5809f219389fda2b411ce997ea4b8bef51ea3906aa6d050fc"

RPROVIDES:${PN} += "pkgconfig-libr \
pkgconfig-r-anal \
pkgconfig-r-arch \
pkgconfig-r-asm \
pkgconfig-r-bin \
pkgconfig-r-bp \
pkgconfig-r-config \
pkgconfig-r-cons \
pkgconfig-r-core \
pkgconfig-r-debug \
pkgconfig-r-egg \
pkgconfig-r-esil \
pkgconfig-r-flag \
pkgconfig-r-fs \
pkgconfig-r-io \
pkgconfig-r-lang \
pkgconfig-r-magic \
pkgconfig-r-main \
pkgconfig-r-muta \
pkgconfig-r-reg \
pkgconfig-r-search \
pkgconfig-r-socket \
pkgconfig-r-syscall \
pkgconfig-r-util \
pkgconfig-sdb \
radare2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
file-devel \
pkgconfig-capstone \
pkgconfig-liblz4 \
pkgconfig-libxxhash \
pkgconfig-libzip \
pkgconfig-openssl \
pkgconfig-r-anal \
pkgconfig-r-arch \
pkgconfig-r-asm \
pkgconfig-r-bin \
pkgconfig-r-bp \
pkgconfig-r-config \
pkgconfig-r-cons \
pkgconfig-r-core \
pkgconfig-r-debug \
pkgconfig-r-egg \
pkgconfig-r-esil \
pkgconfig-r-flag \
pkgconfig-r-fs \
pkgconfig-r-io \
pkgconfig-r-lang \
pkgconfig-r-magic \
pkgconfig-r-muta \
pkgconfig-r-reg \
pkgconfig-r-search \
pkgconfig-r-socket \
pkgconfig-r-syscall \
pkgconfig-r-util \
pkgconfig-zlib \
radare2"

inherit rpm
