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

RPM_NAME = "python313-socksio-1.0.0-2.1.noarch.rpm"
RPM_HASH = "cb55fdef13e6d134e68ac0ce2ad26b9493204882826fe6c5a8fe37e69bbd6fc72d4895b9fcf6597d8dacc3e3cabc463d2e34bba01b257d8ce63d66424bdf7fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-socksio \
python3.13dist-socksio \
python313-socksio \
python3dist-socksio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
