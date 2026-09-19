SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-dash-html-components-2.0.0-2.5.noarch.rpm"
RPM_HASH = "9b32ed768e377f234ad7838112983afbb515fa222ff03e4d9be45afbae538fce203607e8740a4993068fdb580585113f63dd8c77873533876444226c7e629129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-html-components \
python3.13dist-dash-html-components \
python313-dash-html-components \
python3dist-dash-html-components"

RDEPENDS:${PN} += "python-abi"

inherit rpm
