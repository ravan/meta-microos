SUMMARY = "Libraries needed to use Criterion"
DESCRIPTION = "This packages contains all the libraries needed to use Criterion."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "libcriterion3-2.4.3-1.5.aarch64.rpm"
RPM_HASH = "b413758d60f445dd0f306d23301136d525656c054bdcd7d9f571e678a38ca5162f211716ac08b26f1808a1ebc8bbcbf54b94a5c2bc2e94d0f3fe217a263e71b4"

RPROVIDES:${PN} += "libcriterion.so.3 \
libcriterion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcriterion3-devel \
libffi.so.8 \
libgit2.so.1.9 \
libnanomsg.so.6 \
libprotobuf-nanopb.so.0"

inherit rpm
