SUMMARY = "Default Editing RGB profile"
DESCRIPTION = "The RGB profile maintaining perceptual equal lightness. \
The LStar-RGB.icc profile is colorimetric identical to the eciRGB_v2 profile."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-basiccolor-lstarrgb-1.2-16.29.noarch.rpm"
RPM_HASH = "057f9ef892a868c23c66181046043afb9cb0f4589a4168a79df89ce72a5097e28b140608f8edc34a01bc733f1473c31bb5bd14625eaa4c8ae67993bf1d947a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-lstarrgb"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
