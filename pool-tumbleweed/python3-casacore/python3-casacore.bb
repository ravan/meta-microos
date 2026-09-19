SUMMARY = "A wrapper around CASACORE, the radio astronomy library"
DESCRIPTION = "A python wrapper around CASACORE, the radio astronomy library"
LICENSE = "LGPL-3.0-or-later"

PV = "3.7.1"

RPM_NAME = "python3-casacore-3.7.1-1.7.aarch64.rpm"
RPM_HASH = "e9c2519c23caa358769666d1068927d5180125d50f3d59f72fb32bb0f1e0496ae9fd0532ee7d208438220b31411b6af568becc23236fd7b4ae160ca22400a6d8"

RPROVIDES:${PN} += "python3-casacore \
python3.13dist-python-casacore \
python3dist-python-casacore"

RDEPENDS:${PN} += "libc.so.6 \
libcasa-casa.so.9 \
libcasa-derivedmscal.so.9 \
libcasa-images.so.9 \
libcasa-meas.so.9 \
libcasa-measures.so.9 \
libcasa-ms.so.9 \
libcasa-python3.so.9 \
libcasa-scimath.so.9 \
libcasa-tables.so.9 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python3-numpy"

inherit rpm
