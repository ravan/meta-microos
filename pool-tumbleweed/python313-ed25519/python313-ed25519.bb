SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python313-ed25519-1.5-4.14.aarch64.rpm"
RPM_HASH = "4457fd7fca5f7f384bef3493fde987c8b727fec1520f89b41173f72c5fa6a3b3b58a5801f2d54ae717f40bd6257a12262924380f0f2de44f62ebe0298cf11e5f"

RPROVIDES:${PN} += "python3-ed25519 \
python3.13dist-ed25519 \
python313-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
