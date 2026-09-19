SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.2.0"

RPM_NAME = "kissfft-131.2.0-2.4.aarch64.rpm"
RPM_HASH = "fc42dd6fd8f8baa8281f3320245d72c2e31f60198489af713a3870b648f5757acc3a74bca618a1e412277bcc7ac86d9343805cbbfc4bcc36be035c1e64476a66"

RPROVIDES:${PN} += "kissfft"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkissfft-float.so.131 \
libm.so.6 \
libmvec.so.1 \
libpng16.so.16"

inherit rpm
