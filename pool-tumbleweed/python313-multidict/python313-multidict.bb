SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.7.1"

RPM_NAME = "python313-multidict-6.7.1-1.4.aarch64.rpm"
RPM_HASH = "010f893e521ed43fb0c6d8ea15bd2724ab859826686d99a1a49d90e71a68c46fe79b68a1b8f91cf6fff586880d2d1962b5e43f32f71618c2271ce0ffe3f44d01"

RPROVIDES:${PN} += "python3-multidict \
python3.13dist-multidict \
python313-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
