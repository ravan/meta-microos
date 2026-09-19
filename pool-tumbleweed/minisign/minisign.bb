SUMMARY = "A dead simple tool to sign files and verify signatures"
DESCRIPTION = "Minisign is a dead simple tool to sign files and verify signatures. \
 \
It is portable, lightweight, and uses the highly secure Ed25519 public-key signature system."
LICENSE = "ISC"

PV = "0.12"

RPM_NAME = "minisign-0.12-2.4.aarch64.rpm"
RPM_HASH = "b7d6a28c6910fb2f42308bd8c1fd24895571e9fb39408ba267065df0835fe26e7aff848bdc2c54bae6161b6ee9b4402bc17b14f1a45636762408bf9e9c775ae1"

RPROVIDES:${PN} += "minisign"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.26"

inherit rpm
