SUMMARY = "A pytest plugin to create CodSpeed benchmarks"
DESCRIPTION = "A pytest plugin to create CodSpeed benchmarks."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python314-pytest-codspeed-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "d52fe09c53bf8450b371eddfda02219df10a5db963a75c53bdc8a51f1fc149b362506c54f07672cae3652caad8cb14145630819bf561a099b810b0884b259663"

RPROVIDES:${PN} += "python3.14dist-pytest-codspeed \
python314-pytest-codspeed \
python3dist-pytest-codspeed"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python314-cffi \
python314-pytest \
python314-rich"

inherit rpm
