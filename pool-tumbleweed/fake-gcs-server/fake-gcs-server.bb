SUMMARY = "Google Cloud Storage emulator & testing library"
DESCRIPTION = "fake-gcs-server provides an emulator for Google Cloud Storage API. It can be used as a library in Go projects and/or as a standalone binary/Docker image."
LICENSE = "BSD-2-Clause"

PV = "1.52.2"

RPM_NAME = "fake-gcs-server-1.52.2-3.8.aarch64.rpm"
RPM_HASH = "884cba1c90c248034cd08edf5f55f6e52e0f186221325a8a8be736214a12be72df3939a3edd5126469e4c05524a7356ba823445fb1c825ef90d21b3af9855866"

RPROVIDES:${PN} += "fake-gcs-server"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
