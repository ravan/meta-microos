SUMMARY = "Documentation for ccd2cue and the CCD and CUE sheet formats"
DESCRIPTION = "GNU ccd2cue is a CCD sheet to CUE sheet converter.  It supports the full \
extent of CUE sheet format expressiveness, including mixed-mode discs \
and CD-Text meta-data. \
 \
This package contains the documentation, including free documentation on \
the CCD and CUE sheet formats."
LICENSE = "GFDL-1.3"

PV = "0.5"

RPM_NAME = "ccd2cue-doc-0.5-2.33.noarch.rpm"
RPM_HASH = "7814f4c6c4b2c1469920268478175b5f8c1f017eefa44445075b0932ebdfaf5e411785e466bea575f6d271281e39dba0ab08b4c6f9fbcab2935d3546bd73df66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccd2cue-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
ccd2cue \
info"

inherit rpm
