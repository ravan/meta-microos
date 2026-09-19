SUMMARY = "Devel Package to nvidia-open-driver-G07-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "595.99.02"

RPM_NAME = "nvidia-open-driver-G07-signed-longterm-devel-595.99.02-2.2.aarch64.rpm"
RPM_HASH = "d4500c4fb3cb788edfe09c6bf7cb7c48abdfab81fc84f21f815280bff1901b4595f74cffbc89d53f038e04d04e60b4f77a8d1fbe3eca43c3f6ab17038c4fd285"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-longterm-devel \
nvidia-open-driver-G07-signed-longterm-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
