SUMMARY = "Powerful and exquisite WSGI/ASGI framework/toolkit"
DESCRIPTION = "Powerful and exquisite WSGI/ASGI framework/toolkit. \
 \
The minimize implementation of methods required in the Web framework. No redundant implementation means that you can freely customize functions without considering the conflict with baize's own implementation. \
 \
Under the ASGI/WSGI protocol, the interface of the request object and the response object is almost the same, only need to add or delete `await` in the appropriate place. In addition, it should be noted that ASGI supports WebSocket but WSGI does not."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python314-baize-0.23.1-1.5.aarch64.rpm"
RPM_HASH = "a00381b431f9b205a2311f7d84ae9a0a04f0e4d533c9ef3a841c87b16bd3a33838fccdafc9b2a25f3b236d9ccfa818acaa58552b6c73736ba0379ae71a2b8e63"

RPROVIDES:${PN} += "python3.14dist-baize \
python314-baize \
python3dist-baize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
