SUMMARY = "C++ SVG header-only library"
DESCRIPTION = "SVG++ library can be thought of as a framework, containing parsers for \
various SVG syntaxes, adapters that simplify handling of parsed data \
and a lot of other utilities and helpers for the most common tasks."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "svgpp-devel-1.3.1-2.3.noarch.rpm"
RPM_HASH = "865a20944d518e713b8d6186e43cc570da780f514da7f953a8a740999a2626349901975e90e6701ddc2070bd4f95f0a643439f786f2826c4937b1e56b64437fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "svgpp-devel"

RDEPENDS:${PN} += "libboost-headers-devel"

inherit rpm
