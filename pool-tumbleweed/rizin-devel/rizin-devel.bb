SUMMARY = "Development files for the rizin package"
DESCRIPTION = "Development files for the rizin package. See rizin package for more \
information."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rizin-devel-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "c801a03f81aea2813d31c86da3fe0c2f7ced5ca7bb913d0b2e268fe75acb5a0ef0327c616fe6d8c657f1208cfa6b8e82459a8574c7d9389e00fe8b1a5ec35c83"

RPROVIDES:${PN} += "cmake-Rizin \
cmake-rz-arch \
cmake-rz-bin \
cmake-rz-config \
cmake-rz-cons \
cmake-rz-core \
cmake-rz-crypto \
cmake-rz-debug \
cmake-rz-demangler \
cmake-rz-diff \
cmake-rz-egg \
cmake-rz-flag \
cmake-rz-hash \
cmake-rz-il \
cmake-rz-io \
cmake-rz-lang \
cmake-rz-magic \
cmake-rz-main \
cmake-rz-mark \
cmake-rz-reg \
cmake-rz-search \
cmake-rz-sign \
cmake-rz-socket \
cmake-rz-syscall \
cmake-rz-type \
cmake-rz-util \
pkgconfig-rz-arch \
pkgconfig-rz-bin \
pkgconfig-rz-config \
pkgconfig-rz-cons \
pkgconfig-rz-core \
pkgconfig-rz-crypto \
pkgconfig-rz-debug \
pkgconfig-rz-demangler \
pkgconfig-rz-diff \
pkgconfig-rz-egg \
pkgconfig-rz-flag \
pkgconfig-rz-hash \
pkgconfig-rz-il \
pkgconfig-rz-io \
pkgconfig-rz-lang \
pkgconfig-rz-magic \
pkgconfig-rz-main \
pkgconfig-rz-mark \
pkgconfig-rz-reg \
pkgconfig-rz-search \
pkgconfig-rz-sign \
pkgconfig-rz-socket \
pkgconfig-rz-syscall \
pkgconfig-rz-type \
pkgconfig-rz-util \
rizin-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
file-devel \
openssl-devel \
pkgconfig-capstone \
pkgconfig-liblz4 \
pkgconfig-liblzma \
pkgconfig-libmagic \
pkgconfig-libmspack \
pkgconfig-libpcre2-16 \
pkgconfig-libpcre2-32 \
pkgconfig-libpcre2-8 \
pkgconfig-libxxhash \
pkgconfig-libzip \
pkgconfig-libzstd \
pkgconfig-openssl \
pkgconfig-rz-arch \
pkgconfig-rz-bin \
pkgconfig-rz-config \
pkgconfig-rz-cons \
pkgconfig-rz-core \
pkgconfig-rz-crypto \
pkgconfig-rz-debug \
pkgconfig-rz-demangler \
pkgconfig-rz-diff \
pkgconfig-rz-egg \
pkgconfig-rz-flag \
pkgconfig-rz-hash \
pkgconfig-rz-il \
pkgconfig-rz-io \
pkgconfig-rz-lang \
pkgconfig-rz-magic \
pkgconfig-rz-mark \
pkgconfig-rz-reg \
pkgconfig-rz-search \
pkgconfig-rz-sign \
pkgconfig-rz-socket \
pkgconfig-rz-syscall \
pkgconfig-rz-type \
pkgconfig-rz-util \
pkgconfig-tree-sitter \
pkgconfig-zlib \
rizin"

inherit rpm
