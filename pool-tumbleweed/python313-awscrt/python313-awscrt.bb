SUMMARY = "A common runtime for AWS Python projects"
DESCRIPTION = "A common runtime for AWS Python projects"
LICENSE = "Apache-2.0"

PV = "0.36.2"

RPM_NAME = "python313-awscrt-0.36.2-1.1.aarch64.rpm"
RPM_HASH = "c9640ac01f61a617c8c6da2a89a5090793cac1765fdddd6fe6739ebef412554b86d80213ec10be6ef6ac1b8253e6981e617f074c3c7c18b35251fb0668ecd0a1"

RPROVIDES:${PN} += "python3-awscrt \
python3.13dist-awscrt \
python313-awscrt \
python3dist-awscrt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-auth.so.1.0.0 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-event-stream.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-c-mqtt.so.1.0.0 \
libaws-c-s3.so.0unstable \
libaws-checksums.so.1 \
libc.so.6 \
python-abi"

inherit rpm
