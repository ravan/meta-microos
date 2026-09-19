SUMMARY = "A portable command-line YAML processor"
DESCRIPTION = "A lightweight and portable command-line YAML processor. yq uses jq like syntax \
but works with yaml files as well as json. It doesn't yet support everything \
jq does - but it does support the most common operations and functions, and more \
is being added continuously."
LICENSE = "MIT"

PV = "4.53.3"

RPM_NAME = "yq-4.53.3-2.1.aarch64.rpm"
RPM_HASH = "1d0195c43f00ee1f58f50e84cbda28ac51eb377bf595f1acd4b495ded13d4bbcb84fa763125244ffaf9483254e2494e1164832c2e2a2cf56fcdda8968b656fba"

RPROVIDES:${PN} += "yq"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
