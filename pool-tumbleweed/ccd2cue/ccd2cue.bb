SUMMARY = "CCD sheet to CUE sheet converter"
DESCRIPTION = "GNU ccd2cue is a CCD sheet to CUE sheet converter.  It supports the full \
extent of CUE sheet format expressiveness, including mixed-mode discs \
and CD-Text meta-data."
LICENSE = "GPL-3.0+ & GFDL-1.3"

PV = "0.5"

RPM_NAME = "ccd2cue-0.5-2.33.aarch64.rpm"
RPM_HASH = "476373df1842599ec3b36cddffb2ffa1d9959b85368b677562e101bf92a1c82aa71bce09bef74e00622850bea573fd044bbea805aeb5dde8e2c2b464f2ead0fd"

RPROVIDES:${PN} += "ccd2cue"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
