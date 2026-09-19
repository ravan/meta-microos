SUMMARY = "A basic desktop (based on IceWM)"
DESCRIPTION = "This pattern installs a rather basic desktop (icewm)"
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-basic_desktop-20241218-34.1.aarch64.rpm"
RPM_HASH = "0e0f62697cd5b292068d437c330d83eb81a5b1b4cd69763738ebbc5d3537f3bcd1a9229057f752e0377c0852d8b2cce6950dff330ed49b3de90f7a0ff01eb8f3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-basic-desktop"

RDEPENDS:${PN} += "icewm-default \
icewm-theme-branding \
pattern-"

inherit rpm
