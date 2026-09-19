SUMMARY = "Documentation for ghostty"
DESCRIPTION = "This package provides documentation for ghostty"
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-doc-1.3.1-1.6.noarch.rpm"
RPM_HASH = "c8045270df89603acb64edcfc549f03144d49017d2f36f8bfbf912f440cd9d7cac8cd9115fe20b4d0a35ee59153c440d648ba3664abcc2084179aa3188ea7a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-doc"

RDEPENDS:${PN} += ""

inherit rpm
