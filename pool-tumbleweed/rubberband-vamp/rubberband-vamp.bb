SUMMARY = "Vamp plugins for librubberband"
DESCRIPTION = "This package contains the following Vamp plugins: \
 * increments (Output Increments): Output time increment for each \
   input step \
 * aggregate_increments (Accumulated Output Increments): Accumulated \
   output time increments \
 * divergence (Divergence from Linear): Difference between actual \
   output time and the output time for a theoretical linear stretch \
 * phaseresetdf (Phase Reset Detection Function): Curve whose peaks \
   are used to identify transients for phase reset points \
 * smoothedphaseresetdf (Smoothed Phase Reset Detection Function): \
   Phase reset curve smoothed for peak picking \
 * phaseresetpoints (Phase Reset Points): Points estimated as \
   transients at which phase reset occurs \
 * timesyncpoints (Time Sync Points): Salient points which stretcher \
   aims to place with strictly correct timing"
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "rubberband-vamp-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "87572cce9daf08eb69deef9491a7e8abc91059da9d722b24d3d7f982f07b6a022dfd18afd12e232e41686de325bba4e58129eff308b0109c80da5ddff0bf3b65"

RPROVIDES:${PN} += "rubberband-vamp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband3 \
libstdc++.so.6 \
libvamp-sdk.so.2"

inherit rpm
