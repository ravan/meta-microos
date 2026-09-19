SUMMARY = "Web files for font-awesome"
DESCRIPTION = "Web files (css, less, scss, etc) for font-awesome."
LICENSE = "MIT"

PV = "7.3.1"

RPM_NAME = "fontawesome-fonts-web-7.3.1-1.1.noarch.rpm"
RPM_HASH = "580f4cda656e2baab604aabfec0d2c946c3e03adbede194fea5beb958ea8329f1117ba2b9d73d5f3bcb05888e766663724805628d03f3491e669b75b04463207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts-web"

RDEPENDS:${PN} += ""

inherit rpm
