SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-onigurumacffi-1.5.0-1.6.aarch64.rpm"
RPM_HASH = "2174fac92827fd61a6380fc642807e6bbcd375357b0c18e21a211a9db230c6201deac85876d38cc23b828d427b6300656440a4cff357295a9367150981ef56de"

RPROVIDES:${PN} += "python3.14dist-onigurumacffi \
python314-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python314-cffi"

inherit rpm
