SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-dash-html-components-2.0.0-2.5.noarch.rpm"
RPM_HASH = "dcb9243425389e9a1113ed6136060bf8b1b500fa5a515b6983e2026e90b646c201ff8a07874fa3381b8f8244ab228c2a83a6bfa85ed1e7678a6efc6139069a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dash-html-components \
python314-dash-html-components \
python3dist-dash-html-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
