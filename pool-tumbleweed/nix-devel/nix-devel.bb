SUMMARY = "The purely functional package manager"
DESCRIPTION = "Nix is a powerful package manager for Linux and other Unix systems \
that makes package management reliable and reproducible. \
Please refer to the Nix manual for more details. \
 \
This package holds the development files for nix."
LICENSE = "LGPL-2.1-only"

PV = "2.35.2"

RPM_NAME = "nix-devel-2.35.2-1.1.aarch64.rpm"
RPM_HASH = "b86c19905d3249e240a238d611ea013680539ce52894b7b7c0588c12aea265aae6959e1af41f50adf8e3f36293a1c4437a01d7c8476726ff0df20ecbc7d0e8ee"

RPROVIDES:${PN} += "nix-devel \
pkgconfig-nix-cmd \
pkgconfig-nix-expr \
pkgconfig-nix-expr-c \
pkgconfig-nix-fetchers \
pkgconfig-nix-fetchers-c \
pkgconfig-nix-flake \
pkgconfig-nix-flake-c \
pkgconfig-nix-main \
pkgconfig-nix-main-c \
pkgconfig-nix-store \
pkgconfig-nix-store-c \
pkgconfig-nix-util \
pkgconfig-nix-util-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nix \
perl-base \
pkgconfig-bdw-gc \
pkgconfig-libarchive \
pkgconfig-libblake3 \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libcpuid \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-libgit2 \
pkgconfig-libseccomp \
pkgconfig-libsodium \
pkgconfig-libzstd \
pkgconfig-lowdown \
pkgconfig-nix-expr \
pkgconfig-nix-expr-c \
pkgconfig-nix-fetchers \
pkgconfig-nix-fetchers-c \
pkgconfig-nix-flake \
pkgconfig-nix-main \
pkgconfig-nix-store \
pkgconfig-nix-store-c \
pkgconfig-nix-util \
pkgconfig-nix-util-c \
pkgconfig-nlohmann-json \
pkgconfig-readline \
pkgconfig-sqlite3"

inherit rpm
