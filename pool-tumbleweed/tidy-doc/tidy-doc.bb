SUMMARY = "Documentation for tidy and libtidy"
DESCRIPTION = "This package contains the documentation for both tidy and libtidy."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "tidy-doc-5.8.0-2.5.noarch.rpm"
RPM_HASH = "76a361aaa7ffdb3b1f90985a502dfa2bd6fb48ef994583dba45651455ca79ef23fbd1bbf9d3ea12c6b119b2bf4dc47636ccb14ad81997746abc0d386698aacd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tidy-doc"

RDEPENDS:${PN} += ""

inherit rpm
