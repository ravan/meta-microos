SUMMARY = "Kernel firmware files for Intel i915 graphics driver"
DESCRIPTION = "This package contains kernel firmware files for Intel i915 graphics driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260806"

RPM_NAME = "kernel-firmware-i915-20260806-1.1.noarch.rpm"
RPM_HASH = "3ea2f8e920e14f0469a4cf89831b940b10c892c3c87de4145f4cc9db018b0ea158580ff45ddd55ac021bb954e10fd72ebf01a3ff64ab45886293a043b055e309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-i915/adlp-dmc-ver2-09.bin \
firmware-i915/adlp-dmc-ver2-10.bin \
firmware-i915/adlp-dmc-ver2-12.bin \
firmware-i915/adlp-dmc-ver2-14.bin \
firmware-i915/adlp-dmc-ver2-16.bin \
firmware-i915/adlp-dmc.bin \
firmware-i915/adlp-guc-62.0.3.bin \
firmware-i915/adlp-guc-69.0.3.bin \
firmware-i915/adlp-guc-70.1.1.bin \
firmware-i915/adlp-guc-70.bin \
firmware-i915/adls-dmc-ver2-01.bin \
firmware-i915/bmg-dmc.bin \
firmware-i915/bxt-dmc-ver1-07.bin \
firmware-i915/bxt-dmc-ver1.bin \
firmware-i915/bxt-guc-32.0.3.bin \
firmware-i915/bxt-guc-33.0.0.bin \
firmware-i915/bxt-guc-49.0.1.bin \
firmware-i915/bxt-guc-62.0.0.bin \
firmware-i915/bxt-guc-69.0.3.bin \
firmware-i915/bxt-guc-70.1.1.bin \
firmware-i915/bxt-guc-ver8-7.bin \
firmware-i915/bxt-guc-ver9-29.bin \
firmware-i915/bxt-huc-2.0.0.bin \
firmware-i915/bxt-huc-ver01-07-1398.bin \
firmware-i915/bxt-huc-ver01-8-2893.bin \
firmware-i915/cml-guc-33.0.0.bin \
firmware-i915/cml-guc-49.0.1.bin \
firmware-i915/cml-guc-62.0.0.bin \
firmware-i915/cml-guc-69.0.3.bin \
firmware-i915/cml-guc-70.1.1.bin \
firmware-i915/cml-huc-4.0.0.bin \
firmware-i915/cnl-dmc-ver1-06.bin \
firmware-i915/cnl-dmc-ver1-07.bin \
firmware-i915/dg1-dmc-ver2-02.bin \
firmware-i915/dg1-guc-49.0.1.bin \
firmware-i915/dg1-guc-62.0.0.bin \
firmware-i915/dg1-guc-69.0.3.bin \
firmware-i915/dg1-guc-70.1.1.bin \
firmware-i915/dg1-guc-70.bin \
firmware-i915/dg1-huc-7.7.1.bin \
firmware-i915/dg1-huc-7.9.3.bin \
firmware-i915/dg1-huc.bin \
firmware-i915/dg2-dmc-ver2-06.bin \
firmware-i915/dg2-dmc-ver2-07.bin \
firmware-i915/dg2-dmc-ver2-08.bin \
firmware-i915/dg2-guc-70.1.2.bin \
firmware-i915/dg2-guc-70.4.1.bin \
firmware-i915/dg2-guc-70.bin \
firmware-i915/dg2-huc-gsc.bin \
firmware-i915/ehl-guc-33.0.4.bin \
firmware-i915/ehl-guc-49.0.1.bin \
firmware-i915/ehl-guc-62.0.0.bin \
firmware-i915/ehl-guc-69.0.3.bin \
firmware-i915/ehl-guc-70.1.1.bin \
firmware-i915/ehl-huc-9.0.0.bin \
firmware-i915/glk-dmc-ver1-04.bin \
firmware-i915/glk-guc-32.0.3.bin \
firmware-i915/glk-guc-33.0.0.bin \
firmware-i915/glk-guc-49.0.1.bin \
firmware-i915/glk-guc-62.0.0.bin \
firmware-i915/glk-guc-69.0.3.bin \
firmware-i915/glk-guc-70.1.1.bin \
firmware-i915/glk-huc-4.0.0.bin \
firmware-i915/glk-huc-ver03-01-2893.bin \
firmware-i915/icl-dmc-ver1-07.bin \
firmware-i915/icl-dmc-ver1-09.bin \
firmware-i915/icl-guc-32.0.3.bin \
firmware-i915/icl-guc-33.0.0.bin \
firmware-i915/icl-guc-49.0.1.bin \
firmware-i915/icl-guc-62.0.0.bin \
firmware-i915/icl-guc-69.0.3.bin \
firmware-i915/icl-guc-70.1.1.bin \
firmware-i915/icl-huc-9.0.0.bin \
firmware-i915/icl-huc-ver8-4-3238.bin \
firmware-i915/kbl-dmc-ver1-01.bin \
firmware-i915/kbl-dmc-ver1-04.bin \
firmware-i915/kbl-dmc-ver1.bin \
firmware-i915/kbl-guc-32.0.3.bin \
firmware-i915/kbl-guc-33.0.0.bin \
firmware-i915/kbl-guc-49.0.1.bin \
firmware-i915/kbl-guc-62.0.0.bin \
firmware-i915/kbl-guc-69.0.3.bin \
firmware-i915/kbl-guc-70.1.1.bin \
firmware-i915/kbl-guc-ver9-14.bin \
firmware-i915/kbl-guc-ver9-39.bin \
firmware-i915/kbl-huc-4.0.0.bin \
firmware-i915/kbl-huc-ver02-00-1810.bin \
firmware-i915/mtl-dmc-ver2-10.bin \
firmware-i915/mtl-dmc.bin \
firmware-i915/mtl-gsc-1.bin \
firmware-i915/mtl-guc-70.bin \
firmware-i915/mtl-huc-gsc.bin \
firmware-i915/rkl-dmc-ver2-02.bin \
firmware-i915/rkl-dmc-ver2-03.bin \
firmware-i915/skl-dmc-ver1-23.bin \
firmware-i915/skl-dmc-ver1-26.bin \
firmware-i915/skl-dmc-ver1-27.bin \
firmware-i915/skl-dmc-ver1.bin \
firmware-i915/skl-guc-32.0.3.bin \
firmware-i915/skl-guc-33.0.0.bin \
firmware-i915/skl-guc-49.0.1.bin \
firmware-i915/skl-guc-62.0.0.bin \
firmware-i915/skl-guc-69.0.3.bin \
firmware-i915/skl-guc-70.1.1.bin \
firmware-i915/skl-guc-ver1.bin \
firmware-i915/skl-guc-ver4.bin \
firmware-i915/skl-guc-ver6-1.bin \
firmware-i915/skl-guc-ver6.bin \
firmware-i915/skl-guc-ver9-33.bin \
firmware-i915/skl-huc-2.0.0.bin \
firmware-i915/skl-huc-ver01-07-1398.bin \
firmware-i915/tgl-dmc-ver2-04.bin \
firmware-i915/tgl-dmc-ver2-06.bin \
firmware-i915/tgl-dmc-ver2-08.bin \
firmware-i915/tgl-dmc-ver2-12.bin \
firmware-i915/tgl-guc-35.2.0.bin \
firmware-i915/tgl-guc-49.0.1.bin \
firmware-i915/tgl-guc-62.0.0.bin \
firmware-i915/tgl-guc-69.0.3.bin \
firmware-i915/tgl-guc-70.1.1.bin \
firmware-i915/tgl-guc-70.bin \
firmware-i915/tgl-huc-7.0.12.bin \
firmware-i915/tgl-huc-7.0.3.bin \
firmware-i915/tgl-huc-7.5.0.bin \
firmware-i915/tgl-huc-7.9.3.bin \
firmware-i915/tgl-huc.bin \
firmware-i915/xe2lpd-dmc.bin \
firmware-i915/xe3lpd-3002-dmc.bin \
firmware-i915/xe3lpd-dmc.bin \
firmware-i915/xe3p-lpd-dmc.bin \
firmware-xe/bmg-guc-70.bin \
firmware-xe/bmg-huc.bin \
firmware-xe/fan-control-8086-e20b-8086-1100.bin \
firmware-xe/lnl-gsc-1.bin \
firmware-xe/lnl-guc-70.bin \
firmware-xe/lnl-huc.bin \
firmware-xe/nvl-guc-70.bin \
firmware-xe/ptl-gsc-1.bin \
firmware-xe/ptl-guc-70.bin \
firmware-xe/ptl-huc.bin \
kernel-firmware-i915"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
