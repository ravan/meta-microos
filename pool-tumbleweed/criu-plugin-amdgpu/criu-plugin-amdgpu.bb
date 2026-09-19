SUMMARY = "AMDGPU plugin for CRIU"
DESCRIPTION = "This package contains the AMDGPU ROCm support plugin for CRIU."
LICENSE = "GPL-2.0-only"

PV = "4.2.1"

RPM_NAME = "criu-plugin-amdgpu-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "ea72cf6edf197c48e478417b9f66efd0a8367bd7c79806e42d37ef1af6a963d44bc5623b9bd3795644ff72b5eee63bc775e38b0fefb4ba3b4f67ae688e607b2f"

RPROVIDES:${PN} += "criu-plugin-amdgpu"

RDEPENDS:${PN} += "criu \
libc.so.6 \
libdrm-amdgpu.so.1"

inherit rpm
