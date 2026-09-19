SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python314-ed25519-1.5-4.14.aarch64.rpm"
RPM_HASH = "ff90c15c122b0bfc891d6a9943f26692e3b72c781ebd6fbbeaa19c6733de31e88b56606617e1e65e6030903b1404327a12242248556b0b1a5f2408d331413b7a"

RPROVIDES:${PN} += "python3.14dist-ed25519 \
python314-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
