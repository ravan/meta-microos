SUMMARY = "Airspeed Velocity: A Python history benchmarking tool"
DESCRIPTION = "airspeed velocity (asv) is a tool for benchmarking Python packages \
over their lifetime. \
 \
It is designed to benchmark a single project over its lifetime using \
a given suite of benchmarks. The results are displayed in an \
interactive web frontend that requires only a basic static webserver \
to host."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.6.6"

RPM_NAME = "python313-asv-0.6.6-2.1.aarch64.rpm"
RPM_HASH = "c259c622eaf7e12fb25c515f79448c0b4879d857f171eeaf09ecbaca8710706a6e7c11ea0c5f7680fb6c1788d757a710adb89fe7b1a651431fc92a47b61cf8ea"

RPROVIDES:${PN} += "python3-asv \
python3.13dist-asv \
python313-asv \
python3dist-asv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-PyYAML \
python313-Pympler \
python313-asv-runner \
python313-build \
python313-importlib-metadata \
python313-json5 \
python313-packaging \
python313-tabulate \
python313-virtualenv"

inherit rpm
