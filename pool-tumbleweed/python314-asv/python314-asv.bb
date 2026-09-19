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

RPM_NAME = "python314-asv-0.6.6-2.1.aarch64.rpm"
RPM_HASH = "0ce4ea1a69a540516c6279dba607974715da9324386b5362319731085315431c5034133628bdfe0cd05689b708ed61e58ab32b57444c07546d376b2e0c918837"

RPROVIDES:${PN} += "python3.14dist-asv \
python314-asv \
python3dist-asv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-PyYAML \
python314-Pympler \
python314-asv-runner \
python314-build \
python314-importlib-metadata \
python314-json5 \
python314-packaging \
python314-tabulate \
python314-virtualenv"

inherit rpm
