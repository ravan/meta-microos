SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.2.0"

RPM_NAME = "kissfft-devel-131.2.0-2.4.aarch64.rpm"
RPM_HASH = "8468a888c946ec69e7b223c661776dfe630c5d48e845b6c74c4c9639c9684ef5804011b866e8f8fd4a3467d60dbbff9cef5b0f04a308b5e1882f3cab0616c3ff"

RPROVIDES:${PN} += "cmake-kissfft \
kissfft-devel \
pkgconfig-kissfft-float"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkissfft-float131"

inherit rpm
