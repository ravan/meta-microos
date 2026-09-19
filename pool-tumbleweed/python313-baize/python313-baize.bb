SUMMARY = "Powerful and exquisite WSGI/ASGI framework/toolkit"
DESCRIPTION = "Powerful and exquisite WSGI/ASGI framework/toolkit. \
 \
The minimize implementation of methods required in the Web framework. No redundant implementation means that you can freely customize functions without considering the conflict with baize's own implementation. \
 \
Under the ASGI/WSGI protocol, the interface of the request object and the response object is almost the same, only need to add or delete `await` in the appropriate place. In addition, it should be noted that ASGI supports WebSocket but WSGI does not."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python313-baize-0.23.1-1.5.aarch64.rpm"
RPM_HASH = "f9d566a39996b2c785e30454753c198ed49de281413c8bf14c7de462f1fa293948f0eae4e49ab24c68b1ad1205bbd01ec389db544db8ca2c09a541d2a35e50a4"

RPROVIDES:${PN} += "python3-baize \
python3.13dist-baize \
python313-baize \
python3dist-baize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
