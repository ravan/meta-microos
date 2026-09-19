SUMMARY = "TypeScript sources for OpenTUI"
DESCRIPTION = "The TypeScript half of OpenTUI: the core bindings, the keymap library and \
the SolidJS renderer. \
 \
OpenTUI is consumed as TypeScript, not as a compiled artifact - a program \
using it bundles these sources into itself with its own bundler. So this is \
what you build against, and nothing installs it to run."
LICENSE = "MIT & (Unlicense | MIT-0)"

PV = "0.4.5"

RPM_NAME = "opentui-devel-0.4.5-1.1.aarch64.rpm"
RPM_HASH = "17b01b8f099342378d9706205e203411f2b418a0acb59b119f290d2c2311a4f2bec00ea4fe0cadd1944cb0796190c082ae70b8b86213e07cd1eaa591bd782e10"

RPROVIDES:${PN} += "opentui-devel"

RDEPENDS:${PN} += "opentui"

inherit rpm
