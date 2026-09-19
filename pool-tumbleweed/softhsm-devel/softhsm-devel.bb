SUMMARY = "Development package of softhsm"
DESCRIPTION = "The devel package contains the libsofthsm include files"
LICENSE = "BSD-2-Clause"

PV = "2.6.1+git.1732869438.f7883c2"

RPM_NAME = "softhsm-devel-2.6.1+git.1732869438.f7883c2-2.7.aarch64.rpm"
RPM_HASH = "76047715e398d3221cb73b15cbcc4e317544ab58ec7b1a16bfade1b5991bd4b5287683c5a33d290a93c85059789a8b2095c512d5db97c55c9f39e39620e4695f"

RPROVIDES:${PN} += "softhsm-devel"

RDEPENDS:${PN} += "openssl-devel \
softhsm \
sqlite3-devel"

inherit rpm
