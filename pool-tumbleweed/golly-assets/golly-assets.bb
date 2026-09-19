SUMMARY = "Assets for golly"
DESCRIPTION = "This package contains assets for golly: Help, rules, patterns and scripts."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "golly-assets-5.0-2.1.noarch.rpm"
RPM_HASH = "b64f8f3f57c908c93dd02336bbe3dcee040ca8acf30002bc5bf965701858f17daec1043b15993765d03f374a1a866ae16f6241ad354cb7f61be551458e8bcee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golly-assets"

RDEPENDS:${PN} += ""

inherit rpm
