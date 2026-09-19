SUMMARY = "A library for querying and capturing from cameras"
DESCRIPTION = "A library for querying and capturing from cameras, based on nokhwa crate."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-omni-camera-0.6.1-2.13.aarch64.rpm"
RPM_HASH = "2f540194e9b7370a2765f45d5f678dfb7ac11ff11c747a4688804313882edfbd7598b38bfa65d7a23cb55edc5603c9c729e95ec5771e83435ac34970bc663818"

RPROVIDES:${PN} += "python3-omni-camera \
python3.13dist-omni-camera \
python313-omni-camera \
python3dist-omni-camera"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
