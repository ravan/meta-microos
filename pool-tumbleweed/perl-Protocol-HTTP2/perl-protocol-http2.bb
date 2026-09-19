SUMMARY = "HTTP/2 protocol implementation (RFC 7540)"
DESCRIPTION = "Protocol::HTTP2 is HTTP/2 protocol implementation (at \
https://tools.ietf.org/html/rfc7540) with stateful decoders/encoders of \
HTTP/2 frames. You may use this module to implement your own HTTP/2 \
client/server/intermediate on top of your favorite event loop over plain or \
tls socket (see examples)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.140.0"

RPM_NAME = "perl-Protocol-HTTP2-1.140.0-1.1.noarch.rpm"
RPM_HASH = "d0fb9e395a49afc1c46b2eab2e02a74f916cbe08589640e37bd53b7174b4f81d6cfc1da17d24a652016017b9d3818f8456b3a60b3af1caca6fc683f418236a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--HTTP2 \
perl-Protocol--HTTP2--Client \
perl-Protocol--HTTP2--Connection \
perl-Protocol--HTTP2--Constants \
perl-Protocol--HTTP2--Frame \
perl-Protocol--HTTP2--Frame--Continuation \
perl-Protocol--HTTP2--Frame--Data \
perl-Protocol--HTTP2--Frame--Goaway \
perl-Protocol--HTTP2--Frame--Headers \
perl-Protocol--HTTP2--Frame--Ping \
perl-Protocol--HTTP2--Frame--Priority \
perl-Protocol--HTTP2--Frame--Push-promise \
perl-Protocol--HTTP2--Frame--Rst-stream \
perl-Protocol--HTTP2--Frame--Settings \
perl-Protocol--HTTP2--Frame--Window-update \
perl-Protocol--HTTP2--HeaderCompression \
perl-Protocol--HTTP2--Huffman \
perl-Protocol--HTTP2--HuffmanCodes \
perl-Protocol--HTTP2--Server \
perl-Protocol--HTTP2--Server--Stream \
perl-Protocol--HTTP2--StaticTable \
perl-Protocol--HTTP2--Stream \
perl-Protocol--HTTP2--Trace \
perl-Protocol--HTTP2--Upgrade \
perl-Protocol-HTTP2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MIME--Base64"

inherit rpm
