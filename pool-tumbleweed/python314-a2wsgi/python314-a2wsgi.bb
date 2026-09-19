SUMMARY = "Convert WSGI app to ASGI app or ASGI app to WSGI app"
DESCRIPTION = "Convert WSGI app to ASGI app or ASGI app to WSGI app. \
 \
Pure Python. Only depend on the standard library. \
 \
Compared with other converters, the advantage is that a2wsgi will not accumulate the requested content or response content in the memory, so you don't have to worry about the memory limit caused by a2wsgi. This problem exists in converters implemented by uvicorn/startlette or hypercorn."
LICENSE = "Apache-2.0"

PV = "1.10.10"

RPM_NAME = "python314-a2wsgi-1.10.10-1.5.noarch.rpm"
RPM_HASH = "f4260a584788521a000904acb22661113ef273b215fe8a1215d68ee949f798d54ab8bc27a993b828e8f6be4a44f6abd8de61f6d80c821599fd6ebbd6ccc300f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-a2wsgi \
python314-a2wsgi \
python3dist-a2wsgi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
