SUMMARY = "Development files for libcryptopp, a cryptographic library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto. This package is used for crypto++ development."
LICENSE = "BSL-1.0"

PV = "8.9.0"

RPM_NAME = "libcryptopp-devel-8.9.0-6.4.aarch64.rpm"
RPM_HASH = "bc18da26b173bbea418bb12d9df20fd0eab8ebd80254aad8cd3a4a8d03188876c9271bac743e304aef0dde593953b31228fece27046718b2e722bf74a3f10d74"

RPROVIDES:${PN} += "libcryptopp-devel \
pkgconfig-cryptopp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptopp8-9-0"

inherit rpm
