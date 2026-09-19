SUMMARY = "Flags of the World"
DESCRIPTION = "Images for those who want to visualize the data returned by an \
IP-to-Country database (e.g. the one provided by Directi) with \
corresponding flags. Flags provided are based on the iso3166 \
countrycode, that means there are currently 243 flags offered in the \
world set."
LICENSE = "CC-BY-SA-3.0"

PV = "2.23"

RPM_NAME = "webalizer-flags-2.23-28.6.noarch.rpm"
RPM_HASH = "4daac7f33622d51d64eeac298b002954e8b72ea7bc9acde6636fb4b510e34371c07aed04edad892b7c79e32cab828b2001cba353b117b624481d8e7fae3deef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webalizer-flags"

RDEPENDS:${PN} += ""

inherit rpm
