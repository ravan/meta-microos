SUMMARY = "XFCE Extra Applications (Experimental Wayland Variant)"
DESCRIPTION = "Extra Wayland-compatible applications for the XFCE Desktop Environment. \
 \
This pattern includes additional applications suitable for use in XFCE sessions under Wayland. It intentionally avoids packages that depend on or strongly assume the presence of the X11 stack."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_extra_wayland-20230212-12.3.aarch64.rpm"
RPM_HASH = "0cf0c637b6571dd5c0dc210ba241090b3c26b8ca4db2eb351be108275e0aec56bfc180af3349e0043c50c54c88cc4498bdae8062ee80495fa4e586cef5862bd4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-xfce-extra-wayland \
patterns-xfce-xfce-extra-wayland"

RDEPENDS:${PN} += "pattern-"

inherit rpm
