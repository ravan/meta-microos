SUMMARY = "Sans-I/O implementation of SOCKS4, SOCKS4A, and SOCKS5"
DESCRIPTION = "Client-side sans-I/O SOCKS proxy implementation. \
Supports SOCKS4, SOCKS4A, and SOCKS5. \
 \
`socksio` is a sans-I/O library similar to \
[`h11`](https://github.com/python-hyper/h11) or \
[`h2`](https://github.com/python-hyper/hyper-h2/), this means the library itself \
does not handle the actual sending of the bytes through the network, it only \
deals with the implementation details of the SOCKS protocols so you can use \
it in any I/O library you want."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-socksio-1.0.0-2.1.noarch.rpm"
RPM_HASH = "98fdef98262c80eabb2c511ad7d02a9151d2be2865823603420bec7eff06c587732ee2b8352d19d5bd10a769dd29a29fa37041137a0e7bc7d3a79c70f96e829d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-socksio \
python314-socksio \
python3dist-socksio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
